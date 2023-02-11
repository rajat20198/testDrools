package com.example.drools.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {

    private String customerNumber;
    private Integer age;
    private Integer amount;
    private CustomerType customerType;
    private Boolean isPrime;
    private String cardType;
    private Integer orderDiscount=0;
}
