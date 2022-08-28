package com.brundelmouro.javastudies.features.stream;

import com.brundelmouro.javastudies.features.stream.models.Product;
import com.brundelmouro.javastudies.repositories.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
* These exercises are provides by the site:
* https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
* */
@Component
@Slf4j
public class StreamTest03PraticeMediumExercises {

    private ProductRepo productRepo;

    public StreamTest03PraticeMediumExercises(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    /* Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100 */
    public void exerciseOne() {
        List<Product> filteredProducts = productRepo.findAll().stream()
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice() > 100)
                .toList();

        log.info(filteredProducts.toString());
    }
}
