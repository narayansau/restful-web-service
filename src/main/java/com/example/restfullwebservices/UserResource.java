package com.example.restfullwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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
            allUser += System.lineSeparator();
        }


            return allUser;
    }


    // GET /user/{id}

    // retrieve one user
    @GetMapping("/user/{id}")
    public User  retrieveOneUser( @PathVariable int id ) {
        return  user.findOne(id);
    }

    @PostMapping("/user")
    public ResponseEntity<User> postUser( @Valid @RequestBody User user) {
        if(user.getId() == 0)
            user.setId( this.user.getNextid() );

        User saveUser = this.user.save( user );
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest ()
                .path( "/{id}" )
                .buildAndExpand( user.getId() )
                .toUri();

             return  ResponseEntity .created(location).build();

    }

    @DeleteMapping ("/user/{id}")
    public User  deleteOneUser( @PathVariable int id ) {
        return  user.deleteOne(id);
    }
}
