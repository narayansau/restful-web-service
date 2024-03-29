package com.example.restfullwebservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizeResonseExcepcetionHandling extends ResponseEntityExceptionHandler{

@ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity  <Object> handleUserNotFoundException (UserNotFoundException ex , WebRequest request) {
    ExceptionResponse exceptionResponse =
            new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription( false ) );
          return new ResponseEntity ( exceptionResponse , HttpStatus .NOT_FOUND);

    }




}
