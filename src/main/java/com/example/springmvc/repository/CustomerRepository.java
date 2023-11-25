package com.example.springmvc.repository;

import com.example.springmvc.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);
    @Query(value = "select c from Customer c join c.phones p " +
            "where (coalesce(:name, null) is null or c.name like %:name%)" +
            "and (coalesce(:age, null) is null or c.age in (:age))" +
            "and (coalesce(:address, null) is null or c.address like %:address%)" +
            "and (coalesce(:number, null) is null or p.number like %:number%)"
    )
    Page<Customer> findCustomers(Pageable pageable, String name, Integer age, String address, List<String> number);
}
