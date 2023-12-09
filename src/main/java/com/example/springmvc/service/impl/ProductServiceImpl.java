package com.example.springmvc.service.impl;

import com.example.springmvc.entity.Product;
import com.example.springmvc.repository.ProductRepository;
import com.example.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
//        return productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        return productRepository.findAll();
    }
}
