package com.company.springbootdemo;

import com.company.springbootdemo.model.Alien;
import com.company.springbootdemo.model.Laptop;
import com.company.springbootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

       /* Alien obj = context.getBean(Alien.class);
        obj.code();*/

        LaptopService service=context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);
    }

}
