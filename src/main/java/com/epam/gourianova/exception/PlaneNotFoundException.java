package com.epam.gourianova.exception;

public class PlaneNotFoundException extends RuntimeException{
    public PlaneNotFoundException ( String message) {
        super(message);
    }
}
