package com.example.springmvc.controller;

import com.example.springmvc.entity.Customer;
import com.example.springmvc.model.req.CustomerReq;
import com.example.springmvc.model.res.CustomerRes;
import com.example.springmvc.model.res.Pagination;
import com.example.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<CustomerRes> getListReviews(@RequestBody CustomerReq request) {
        Pageable pageable = PageRequest.of(request.getPageNumber(), request.getPageSize());
        Page<Customer> page = customerService.getCustomers(
                pageable,
                request.getName(),
                request.getAge(),
                request.getAddress(),
                request.getNumber());
        CustomerRes response = new CustomerRes();
        response.setData(page.getContent());
        response.setPagination(new Pagination(page.getPageable().getPageNumber(), page.getSize(), page.getTotalElements()));
        return ResponseEntity.ok(response);
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(customerService.getAll());
    }
}

