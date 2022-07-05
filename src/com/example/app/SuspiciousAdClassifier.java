package com.example.app;

import com.example.app.model.Post;

import java.util.ArrayList;

public class SuspiciousAdClassifier implements Ads {

    private ArrayList<String> suspiciousWords = new ArrayList<>();

    public void addToSuspiciousWords(String word){
        suspiciousWords.add(word);
    }


    @Override
    public boolean classify(Post post) {
        String tagLine = post.getTag();

        for(int i = 0;i<suspiciousWords.size();i++){
            if(tagLine.contains(suspiciousWords.get(i)))
                return true;
        }
        return false;
    }
}
