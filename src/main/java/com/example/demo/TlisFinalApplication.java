package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TlisFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TlisFinalApplication.class, args);


    }

    public void setHelloWorld(){
        System.out.println("Hello world from me");
    }
}
