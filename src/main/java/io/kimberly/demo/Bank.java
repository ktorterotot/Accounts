package io.kimberly.demo;

import org.springframework.http.HttpStatus;

import java.util.List;

public class Bank {

    private HttpStatus code;
    private String message;
    private List<Data> Data;


    public Bank(){

    }

    Bank(HttpStatus code){
        this();
        this.code = code;
    }

    Bank(HttpStatus code, String message, Throwable ex){
        this();
        this.code = code;
        this.message = ex.getLocalizedMessage();
    }


}
