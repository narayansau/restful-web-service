package com.example.restfullwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource{

     //GET /users
    // retrieve all users

    @Autowired
    UserDaoService  user = new UserDaoService();

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return  user.findAll();
    }

    @GetMapping("/formattedusers")
    public String retrieveAllFormattedUsers() {
        //return  user.findAll();
        String allUser="";

        for ( User  s : user.findAll() )  {
            allUser +=  s.toString();
            allUser += "\\n";
        }


            return allUser;
    }


    // GET /user/{id}
    // retrieve one user
    @GetMapping("/user/id")
    public User  retrieveOneUser( int id ) {
        return  user.findOne(id);
    }
}
