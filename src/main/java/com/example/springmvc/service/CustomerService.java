package com.example.springmvc.service;

import com.example.springmvc.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    void save(Customer customer);
    Optional<Customer> findId(Long id);
    List<Customer> findName(String name);
    List<Customer> get();
    void delete(Long id);
}
