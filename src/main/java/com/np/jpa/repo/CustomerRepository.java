package com.np.jpa.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.np.jpa.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Optional<Customer> findById(Long id);

	List<Customer> findAll();
}
