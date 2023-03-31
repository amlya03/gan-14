package com.roytuts.spring.boot.ajax.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CustomerRestController {
	@Autowired
	private CustomerService service;

	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getCompanyList() {
		return new ResponseEntity<List<Customer>>(service.listAll(), HttpStatus.OK);
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCompany(@PathVariable int id) {
		return new ResponseEntity<Customer>(service.getCustomerById(id), HttpStatus.OK);
	}

	@PostMapping("/customer/save")
	public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Customer customer) {
		service.saveCustomer(customer);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/customer/delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable int id) {
		service.deleteCustomerById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
