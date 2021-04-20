package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;
@Component
public class TestFeign {

    @Autowired
    private PaymentFeignService paymentFeignService;
@Test
    public  void testfeign() {
        Long id=1l;
       System.out.println(paymentFeignService.paymentFeignTimeout());
    }



}
