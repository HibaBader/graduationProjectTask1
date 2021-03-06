package com.example.cscommunity;

public class Subject {
    private String name;
    private String imageURL;

    public Subject(){}

    public Subject(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
