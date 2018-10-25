package com.example.demo.Repository;
//repository
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Customer;

public interface Repository extends JpaRepository<Customer,Long> {

}
