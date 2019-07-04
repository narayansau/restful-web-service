package com.example.restfullwebservices.Versioning;

public class PersonV1{
    String Name;

    public PersonV1(String name) {
        Name=name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name=name;
    }
}
