package com.example.demo_6.exception;

public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException() {
        super("Dog is not found!");
    }
}
