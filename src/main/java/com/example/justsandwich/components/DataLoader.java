package com.example.justsandwich.components;

import com.example.justsandwich.models.Sandwich;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        SimpleDateFormat date1 =
                new SimpleDateFormat ("AD 2020.05.13 10:47:00 a");

        Sandwich sandwich1 = new Sandwich(
                "Just Egg Mayonnaise",
                date1,
                4.99,
                00000001,
                5,
                100
        );

        Sandwich sandwich2 = new Sandwich(
                "Just Cheese",
                date1,
                4.99,
                00000002,
                4.5,
                100
        );

        Sandwich sandwich3 = new Sandwich(
                "Just Coronation Chicken",
                date1,
                4.99,
                00000003,
                3.9,
                100
        );

        Sandwich sandwich4 = new Sandwich(
                "Just Salad",
                date1,
                4.99,
                00000004,
                5,
                100
        );

        Sandwich sandwich5 = new Sandwich(
                "Just Ham",
                date1,
                4.99,
                00000005,
                4.1,
                100
        );

        Sandwich sandwich6 = new Sandwich(
                "Just BLT",
                date1,
                4.99,
                00000006,
                4,
                100
        );
    }
}
