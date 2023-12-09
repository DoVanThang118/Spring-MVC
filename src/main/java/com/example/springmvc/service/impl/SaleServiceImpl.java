package com.example.springmvc.service.impl;

import com.example.springmvc.entity.Sale;
import com.example.springmvc.repository.SaleRepository;
import com.example.springmvc.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Override
    public List<Sale> findAllSale() {
//        return saleRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        return saleRepository.findAll();
    }
}
