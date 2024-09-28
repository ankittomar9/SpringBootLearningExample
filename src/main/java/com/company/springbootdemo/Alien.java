package com.company.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    int age;
    @Autowired
    Laptop laptop;

    public void code(){
        laptop.compile();
    }

}
