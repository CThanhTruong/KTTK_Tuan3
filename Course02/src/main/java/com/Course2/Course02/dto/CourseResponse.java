package com.Course2.Course02.dto;

import java.io.Serializable;

public class CourseResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String img;

    private String shortDescription;
    private double price;
    private String userName;
    public CourseResponse() {
        // TODO Auto-generated constructor stub
    }

    public CourseResponse(String name, String img, String shortDescription, double price, String userName) {
        super();
        this.name = name;
        this.img = img;
        this.shortDescription = shortDescription;
        this.price = price;
        this.userName = userName;
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

    @Override
    public String toString() {
        return "CourseResponse [name=" + name + "," +
                " img=" + img + "," +
                " shortDescription=" + shortDescription + ", price="
                + price + ", userName=" + userName + "]";
    }
}
