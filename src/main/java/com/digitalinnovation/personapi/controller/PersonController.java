package com.digitalinnovation.personapi.controller;


import com.digitalinnovation.personapi.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping
    public String getBook(){

        Person person = new Person();


        return "API Test!";
    }
}
