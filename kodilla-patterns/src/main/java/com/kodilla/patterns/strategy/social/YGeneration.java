package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        socialPublisher = new TwitterPublisher();
    }
}
