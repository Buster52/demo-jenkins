package com.buster.demo.jenkins.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
    @GetMapping("/name")
    public String getName(){
        return "Customer 1";
    }
}