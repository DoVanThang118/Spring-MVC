package com.example.springmvc.service;

import com.example.springmvc.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    void save(Customer customer);
    Optional<Customer> findId(Long id);
    List<Customer> findName(String name);
    List<Customer> getAll();
    Page<Customer> getCustomers(Pageable pageable, String name, Integer age, String address, List<String> number);
    void delete(Long id);
}
