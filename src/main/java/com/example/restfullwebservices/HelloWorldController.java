package com.example.restfullwebservices;

// controller

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController{

    // Method Hello World , Roth Yatra Lokaronyo Maha Dhumdham
    // GET
    // hello-world

    /************
     *
     *  @RequestMapping(method = RequestMethod.GET , path = "/hello-world") and
     *   @GetMapping( path = "/hello-world")  are same
     *
     * @return
     */

   @RequestMapping(method = RequestMethod.GET , path = "/hello-world")

   // @GetMapping( path = "/hello-world")
 public String  HelloWorld() {

     return ("Hello World From Narayan Sau");


 }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean   helloWorldBean() {

        return new HelloWorldBean ("Hello World Bean Narayan") ;


    }

    @GetMapping( path = "/hello-world/path-variable/{name}")
    public HelloWorldBean   helloWorldPathVariable(@PathVariable String name) {

        return new HelloWorldBean ( String.format(  "Hello World Bean Narayan : %s ", name)) ;


    }
}



