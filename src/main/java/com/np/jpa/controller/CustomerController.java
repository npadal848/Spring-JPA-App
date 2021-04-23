package com.np.jpa.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.np.jpa.entity.Customer;
import com.np.jpa.entity.CustomerResponseVO;
import com.np.jpa.model.ResponseVO;
import com.np.jpa.repo.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	@PostMapping("/save")
	public ResponseEntity<CustomerResponseVO> save(@RequestBody Customer cust) {
		CustomerResponseVO responseVO = new CustomerResponseVO();
		responseVO.setCustomer(repository.save(cust));
		responseVO.setResponse(new ResponseVO("000", "Customer created successfully"));
		return new ResponseEntity<>(responseVO, HttpStatus.CREATED);
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<CustomerResponseVO> getCustomerById(@PathVariable("id") Long id) {
		CustomerResponseVO responseVO = new CustomerResponseVO();
		responseVO.setCustomer(repository.findById(id).get());
		responseVO.setResponse(new ResponseVO("000", "SUCCESS"));
		return new ResponseEntity<>(responseVO, HttpStatus.OK);
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomers() {
		List<Customer> customers = repository.findAll();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}
}
