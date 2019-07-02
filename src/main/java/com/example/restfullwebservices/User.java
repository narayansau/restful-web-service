package com.example.restfullwebservices;

import java.util.Date;

public class User{
    private  int id ;
    private String name;
    private Date birthDate;





    public User( int id,  String name, Date birthDate) {
        super();
        this.id = id;
        this.name=name;
        this.birthDate=birthDate;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate=birthDate;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public User() {
    }


}
