package com.example.springmvc.model.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerReq {

    private String name;

    private Integer age;

    private String address;

    private List<String> number;

    private int pageNumber = 0;

    private int pageSize = 20;
}
