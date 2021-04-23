package com.np.jpa.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.np.jpa.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findById(Long id);

	List<Customer> findAll();
	
	
}
