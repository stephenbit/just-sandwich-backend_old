package com.example.justsandwich.controllers;

import com.example.justsandwich.repositories.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sandwiches")
public class SandwichesController {
    @Autowired
    SandwichRepository sandwichRepository;
}
