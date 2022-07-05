package com.example.app;

import com.example.app.model.Post;

public interface SocialMedia {
    void addPost(Post post);

    void deletePost(int id);
}
