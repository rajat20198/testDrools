package com.example.drools.test;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.drools.test.OrderRequest;
import com.example.drools.test.OrderDiscount;
@Service
public class OrderDiscountService {

    @Autowired
    private KieContainer kieContainer;

    public OrderDiscount getDiscount(OrderRequest orderRequest) {
        OrderDiscount orderDiscount = new OrderDiscount();
        KieSession kieSession = kieContainer.newKieSession();
//        kieSession.setGlobal("orderDiscount", orderDiscount);
        kieSession.insert(orderRequest);
        kieSession.fireAllRules();
        orderDiscount.setDiscount( orderRequest.getOrderDiscount());
        System.out.println(orderDiscount);
        System.out.println(orderRequest.getOrderDiscount());
        System.out.println(orderRequest.getCustomerNumber());
        kieSession.dispose();
        return orderDiscount;
    }
}
