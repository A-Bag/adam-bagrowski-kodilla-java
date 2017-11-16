package com.kodilla.patterns.social;

import com.kodilla.patterns.social.publisher.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        socialPublisher = new SnapchatPublisher();
    }
}
