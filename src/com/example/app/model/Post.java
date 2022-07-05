package com.example.app.model;

public class Post {

    private int id;

    private String tag;

    public Post(int id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }


    public String getTag() {
        return tag;
    }

}
