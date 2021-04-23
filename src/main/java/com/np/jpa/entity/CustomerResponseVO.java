package com.np.jpa.entity;

import java.io.Serializable;

import com.np.jpa.model.ResponseVO;

public class CustomerResponseVO implements Serializable {

	private static final long serialVersionUID = 682946847349299940L;

	private Customer customer;
	private ResponseVO response;
	
	public CustomerResponseVO() {
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ResponseVO getResponse() {
		return response;
	}

	public void setResponse(ResponseVO response) {
		this.response = response;
	}

}
