package com.np.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Customer {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;
	private String name;
	private String mobileNo;

	public Customer() {
	}

	public Customer(Long custId, String name, String mobileNo) {
		this.custId = custId;
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}
}
