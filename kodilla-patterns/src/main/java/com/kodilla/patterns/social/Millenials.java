package com.kodilla.patterns.social;

import com.kodilla.patterns.social.publisher.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        socialPublisher = new FacebookPublisher();
    }
}
