package com.example.restfullwebservices.Versioning;

public class Name{

    private  String firtName;
    private  String lastName;

    public Name(String firtName, String lastName) {
        this.firtName=firtName;
        this.lastName=lastName;
    }

    public Name() {
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName=firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
}
