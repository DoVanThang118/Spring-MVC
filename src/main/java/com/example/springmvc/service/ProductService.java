package com.example.springmvc.service;

import com.example.springmvc.entity.Employee;
import com.example.springmvc.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAllProduct();
}
