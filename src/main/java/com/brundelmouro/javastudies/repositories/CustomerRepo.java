package com.brundelmouro.javastudies.repositories;

import java.util.List;

import com.brundelmouro.javastudies.stream.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

	List<Customer> findAll();
}
