package com.example.rest.webservices.restfulwebservices.hellouser;

public class HelloUsername {

    private String message;

    public HelloUsername(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("Hello [message = %s]", message );

    }
}
