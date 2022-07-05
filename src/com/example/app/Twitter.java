package com.example.app;

import com.example.app.model.Post;

import java.util.ArrayList;
import java.util.List;

public class Twitter implements SocialMedia{

    private List<Post> posts = new ArrayList<>();

    private static Ads ads = new SuspiciousAdClassifier();

    static {
        ads.addToSuspiciousWords("Escort");
        ads.addToSuspiciousWords("guests");
    }

    @Override
    public void addPost(Post post) {
        if(!ads.classify(post)){
            posts.add(post);
            System.out.println("Post added successfully");
        }
        else
            System.out.println("Post failed to add, classified as suspicious");
    }

    @Override
    public void deletePost(int id) {
        if(this.posts == null){
            System.out.println("wrong id");
            return;
        }
        for(int i = 0;i<posts.size();i++){
            if(posts.get(i).getId() == id){
                posts.remove(posts.get(i));
                System.out.println("post with id "+ id + " removed successfully");
                break;
            }
        }
    }


}
