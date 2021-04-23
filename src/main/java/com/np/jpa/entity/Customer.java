package com.np.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@SequenceGenerator(
			name = "customer_seq",
			initialValue = 103
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
	@Column(name = "cust_id")
	private Long custId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile_no")
	private String mobileNo;

	public Customer() {
	}

	public Customer(String name, String mobileNo) {
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
