package com.example.springmvc.controller;

import com.example.springmvc.entity.Product;
import com.example.springmvc.entity.Sale;
import com.example.springmvc.service.ProductService;
import com.example.springmvc.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;
;

    @GetMapping
    public String findAllSaleProduct(Model model) {
        List<Sale> sales = saleService.findAllSale();
        model.addAttribute("sales", sales);
        return "sale";
    }
}
