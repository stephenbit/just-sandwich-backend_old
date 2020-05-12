package com.example.justsandwich.components;

import com.example.justsandwich.models.Sandwich;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Calendar calendar1 = new Calendar(1,1)
        Sandwich sandwich1 = new Sandwich(
                "Egg Mayonnaise Sandwich",
                calendar1,
                4.99,
                00000001,
                5,
                100
        );
    }
}
