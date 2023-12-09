package com.example.springmvc.service;

import com.example.springmvc.entity.Employee;
import com.example.springmvc.entity.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    List<Sale> findAllSale();
}
