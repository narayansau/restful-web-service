package com.example.restfullwebservices;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
public class UserDaoService{
    private static  List <User>  users = new ArrayList <>();
    private static int id =0;


    private static int getNextid() {
        return ++id;
    }

    static {
        users.add(  new User( getNextid(), "Adam" , new Date()) );
        users.add(  new User( getNextid(),  "Narayan" , new Date()) );
        users.add(  new User( getNextid(), "Ratan" , new Date()) );
        users.add(  new User( getNextid(),  "Aditi" , new Date()) );
    }

    public List<User>  findAll() {

        return users;
    }

    public  User save(User user) {
        users.add(   user );
        //users.add(  new ( user) );
        return user;
    }
    public  User findOne(int id) {
        for ( User user: users) {
            if ( user.getId() == id)
                return user;
        }
        return null;

    }
}
