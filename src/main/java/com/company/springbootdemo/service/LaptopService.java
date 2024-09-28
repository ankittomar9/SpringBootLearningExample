package com.company.springbootdemo.service;

import com.company.springbootdemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;




    public void addLaptop(Laptop lap ){
        System.out.println("Laptop Service called Laptop added");
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
