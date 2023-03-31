package com.roytuts.spring.boot.ajax.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@SequenceGenerator(name="customer_sequence",sequenceName="sq_customer", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="customer_sequence")
	
	@Column(name = "custid")
	private Long id;
	
	@Column(name = "custname", length = 45)
	private String name;
	
	@Column(name = "custemail", length = 100)
	private String email;
	
	@Column(name = "custaddress", length = 255)
	private String address;
	
}
