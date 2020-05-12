package com.example.justsandwich.models;
import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Calendar dateAdded;

    @Column
    private double price;

    @Column
    private int photoId;

    @Column
    private Integer rating;

    @Column
    private int numberSold;

    public Sandwich(
            String name,
            Calendar dateAdded,
            double price,
            int photoId,
            Integer rating,
            int numberSold
    ) {
        this.name = name;
        this.dateAdded = dateAdded;
        this.price = price;
        this.rating = rating;
        this.numberSold = numberSold;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Calendar dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }
};