package com.example.springmvc.service.impl;

import com.example.springmvc.entity.Customer;
import com.example.springmvc.repository.CustomerRepository;
import com.example.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findId(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public List<Customer> get() {
        return customerRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public void delete(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isEmpty()) {
            throw new RuntimeException("Not found Customer "+ id);
        }
        try {
            customerRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Database error. Can't delete user");
        }
    }
}
