package com.example.demo_6.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonCatNotFoundException extends RuntimeException {


    public PersonCatNotFoundException() {
        super("PersonCat is not found!");
    }
}
