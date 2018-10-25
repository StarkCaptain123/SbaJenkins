package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.Repository;

@Service
public class CustomerService
{
	@Autowired
	Repository er;
	
	
	public List<Customer> getall()
	{
		return er.findAll();
	}
}
