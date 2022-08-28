package com.brundelmouro.javastudies.repositories;

import java.util.List;

import com.brundelmouro.javastudies.features.stream.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	List<Product> findAll();
}
