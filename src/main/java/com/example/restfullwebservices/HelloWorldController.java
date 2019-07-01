package com.example.restfullwebservices;

// controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    // Method Hello World , Roth Yatra Lokaronyo Maha Dhumdham
    // GET
    // hello-world

   // @RequestMapping(method = RequestMethod.GET , path = "/hello-world")

    @GetMapping( path = "/hello-world")
 public String  HelloWorld() {

     return ("Hello World From Narayan Sau");


 }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean   helloWorldBean() {

        return new HelloWorldBean ("Hello World Bean Narayan") ;


    }
}



