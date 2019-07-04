package com.example.restfullwebservices;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.apache.catalina.LifecycleState;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController{
  @GetMapping("/filtering")
     public SomeBean retrieveSomeBean1() {

      SomeBean someBean = new SomeBean("Value1", "Value2", "Value3");


      return ( someBean);

         //return new SomeBean("Value1", "Value2", "Value3");
     }

    @GetMapping("/filtering1")
    public MappingJacksonValue retrieveSomeBean2() {

        SomeBean someBean = new SomeBean("Value1", "Value2", "Value3");

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter
                        .filterOutAllExcept( "field1", "field2" ) ;

        //FilterProvider filters = new SimpleFilterProvider().addFilter( "someBeanFilter" )

        MappingJacksonValue mappingJacsonValue =
                new MappingJacksonValue (someBean);
       // mappingJacsonValue.setFilters(filter);
       // return ( someBean);

        return mappingJacsonValue;

        //return new SomeBean("Value1", "Value2", "Value3");
    }


    @GetMapping("/filtering-list")
    public List <SomeBean> retrieveListOfSomeBean() {
        return Arrays.asList( new SomeBean("Value1", "Value2", "Value3"),
                new SomeBean("Value11", "Value22", "Value23") )  ;
    }
}
