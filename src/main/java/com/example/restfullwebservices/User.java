package com.example.restfullwebservices;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User{
    private  int id ;

    @Size(min = 2, max=40, message= "Name should have at least two characters")
    private String name;

    /**
     *
     */
    @Past
    private Date birthDate;

 public User ( User thisuser) {

 }



    public User( int id,  String name, Date birthDate) {
        super();
        this.id = id;
        this.name=name;
        this.birthDate=birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
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
