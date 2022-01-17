package com.kata.bank.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", nullable = false)
	String customerId;
	
	@Column(name = "firstname", nullable = false)
	String firstName;
	
	@Column(name = "lastname", nullable = false)
	String lastName;
	
	@Column(name = "address", nullable = false)
	String address;
	
	@Column(name = "phone", nullable = false)
	String phone;
	
	@Column(name = "country", nullable = false)
	String country;
	
	@Column(name = "zip", nullable = false)
	String zip;
	
	@Column(name = "city", nullable = false)
	String city;
	
	@Column(name = "civility", nullable = false)
	String civility;

}
