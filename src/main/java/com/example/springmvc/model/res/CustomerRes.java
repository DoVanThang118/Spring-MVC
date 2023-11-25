package com.example.springmvc.model.res;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerRes {

    private Object data;

    private Pagination pagination;
}
