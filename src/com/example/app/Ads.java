package com.example.app;

import com.example.app.model.Post;

public interface Ads {
    boolean classify(Post post);

    void addToSuspiciousWords(String word);
}
