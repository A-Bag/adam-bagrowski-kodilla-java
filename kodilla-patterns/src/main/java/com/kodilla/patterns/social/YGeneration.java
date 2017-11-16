package com.kodilla.patterns.social;

import com.kodilla.patterns.social.publisher.TwitterPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        socialPublisher = new TwitterPublisher();
    }
}
