package com.example.restfullwebservices;

public class HelloWorldBean{

    String hello;

    public HelloWorldBean(String hello) {
        this.hello=hello;
    }

    public void setHello(String hello) {
        this.hello=hello;
    }

    public String getHello() {
        return hello;
    }

    @Override
    public String toString() {
        return ( "HelloWorldBean{" +
                "hello='" + hello + '\'' +
                '}' );
    }
}
