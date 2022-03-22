package com.example.rest.webservices.restfulwebservices.hellouser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloUsernameController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello")
    public String helloUsername(){
        return "Hello";
    }

    @GetMapping(path = "/hello-bean")
    public HelloUsername helloUsernameBean(){
        return new HelloUsername("Hello User");
    }

    @GetMapping(path = "/hello/path-variable/{name}")
    public HelloUsername helloUsernamePathVariable(@PathVariable String name){
        return new HelloUsername(String.format("Hello, %s",name ));
    }

    @GetMapping(path = "/hello-internationalized")
    public String helloUsernameInternationalized(){
        return messageSource.getMessage("hello.message",null, LocaleContextHolder.getLocale());
    }


    @GetMapping(path = "/hello-internationalized/{name}")           //mapping Get request for the method to URI
    public String helloInternationalizedPathVariable(@PathVariable String name){
        return messageSource.getMessage("hello.message", new Object[]{name},
                LocaleContextHolder.getLocale());

    }

}
