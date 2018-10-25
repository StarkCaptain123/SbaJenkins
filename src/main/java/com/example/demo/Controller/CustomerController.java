package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController
{
	@Autowired
	CustomerService cs;
	
	
	@GetMapping("/Customer")
	public List<Customer> get()
	{
		return cs.getall();
	}

}
