package com.example.app;
import com.example.app.model.Post;

// Human trafficking case study
public class User {

    public static void main(String[] args){

        Post post = new Post(1, "Escortisio khazipurio");
        Post post1 = new Post(2, "welcome to the Empire");

        SocialMedia twitter = new Twitter();

        twitter.addPost(post);
        twitter.deletePost(1);


        twitter.addPost(post1);
        twitter.deletePost(2);
    }
}
