package com.example.restfullwebservices;

import org.springframework.stereotype.Component;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


@Component
public class UserDaoService{
    private static  List <User>  users = new ArrayList <>();
    private static int id =0;


    public static int getNextid() {
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

        boolean found = true;
        for ( User user: users) {
            if ( user.getId() == id)
                return user;
            else
                found = false;
        }
        if ( ! found )
            throw new UserNotFoundException(  "id = " + id );
        return null;

    }

    public  User deleteOne(int id) {

        boolean found = true;
        Iterator<User>  userIndex = users.iterator();
        while( userIndex.hasNext() ) {
            User user = userIndex.next();
            if ( user.getId() == id) {
                userIndex.remove();
                return user;
            }
            else
                found = false;
        }
        if ( ! found )
            throw new UserNotFoundException(  "id = " + id );
        return null;

    }

}
