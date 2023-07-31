package com.Course1.demoCourse01.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbCourse")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "nvarchar(255)")
    private String name;
    private String img;
    @Column(columnDefinition = "nvarchar(255)")
    private String shortDescription;
    private double price;
    private String userName;

    public Course() {
        // TODO Auto-generated constructor stub
    }

    public Course(String name, String img, String shortDescription, double price, String userName) {
        super();
        this.name = name;
        this.img = img;
        this.shortDescription = shortDescription;
        this.price = price;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

