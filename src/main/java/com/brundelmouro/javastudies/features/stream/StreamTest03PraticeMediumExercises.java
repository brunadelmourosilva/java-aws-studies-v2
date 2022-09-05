package com.brundelmouro.javastudies.features.stream;

import com.brundelmouro.javastudies.features.stream.models.Order;
import com.brundelmouro.javastudies.features.stream.models.Product;
import com.brundelmouro.javastudies.repositories.OrderRepo;
import com.brundelmouro.javastudies.repositories.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
* These exercises are provides by the site:
* https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
* */
@Component
@Slf4j
public class StreamTest03PraticeMediumExercises {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public StreamTest03PraticeMediumExercises(final ProductRepo productRepo, final OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    /* Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100 */
    public void exerciseOne() {
        List<Product> filteredProducts = productRepo.findAll().stream()
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice() > 100)
                .toList();

        log.info(filteredProducts.toString());
    }

    public boolean isOrderValid(Set<Product> products){
        for (Product p : products) {
            if(!p.getCategory().equals("Baby")) return false;
        }
        return true;
    }

    /* Exercise 2 — Obtain a list of order with products belong to category “Baby” */
    public void exerciseTwo() {
        List<Order> filtredProdutsOnOrderList = orderRepo.findAll()
                        .stream()
                        .filter(order -> isOrderValid(order.getProducts()))
                        .toList();

        filtredProdutsOnOrderList.forEach(x -> System.out.println(x.getId()));
    }

    /* Exercise 3 - Obtain a list of product with category = “Toys” and then apply 10% discount */
    public void exerciseThree() {
        List<Product> filteredProducts = productRepo.findAll().stream()
                .filter(product -> product.getCategory().equals("Toys"))
                .map(product -> product.setPrice(product.getPrice() * 0.90))
                .toList();

        filteredProducts.forEach(x -> log.info(x.getName() + " | " + " New price: " + x.getPrice()));
    }

    /* Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021 */
    public void exerciseFour() {
        orderRepo.findAll().stream()
                .filter(order -> order.getCustomer().getTier() == 2) //filter customers that contains tier equals 2
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                .flatMap(order -> order.getProducts().stream()) //the order contains, for example, 3. If each order contains 10 products, the final output will be 30(3 x 10)
                .distinct() //If the flatMap returns repeated products, distinct() method will remove it
                .forEach(order -> System.out.println(order.getId()));
    }

    /* Exercise 5 — Get the cheapest products of “Books” category */
    public void exerciseFive() throws ClassNotFoundException {
        Product filteredProduct = productRepo.findAll().stream()
                .filter(product -> product.getCategory().equals("Books"))
                .sorted(Comparator.comparing(productSorted -> productSorted.getPrice()))
                .findFirst()
                .orElseThrow(() -> new ClassNotFoundException());

        System.out.println(filteredProduct.toString());
    }
}
