package com.example.restfullwebservices.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersoningController{

    @GetMapping("/v1/name")
    public PersonV1 personV1() {
        return new PersonV1( "Narayan Sau" );
    }

    @GetMapping("/person/param")
    public PersonV1 DefaultparamV1() {
        return paramV1();
    }


    @GetMapping(value="/person/param", params="version=1")
    public PersonV1 paramV1() {
        return new PersonV1( "Narayan Sau" );
    }
    @GetMapping("/v2/name")
    public PersonV2 personV2 () {

        return new PersonV2( new Name("Narayan Chandra", "Sau") );
    }
    @GetMapping(value="/person/header", headers="X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1( "Narayan Sau" );
    }
    @GetMapping(value="/person/header", headers="X-API-VERSION=2")
    public PersonV2 headerV2 () {

        return new PersonV2( new Name("Narayan Chandra", "Sau") );
    }

    @GetMapping(value="/person/param", params="version=2")
    public PersonV2 paramV2 () {

        return new PersonV2( new Name("Narayan Chandra", "Sau") );
    }
}
