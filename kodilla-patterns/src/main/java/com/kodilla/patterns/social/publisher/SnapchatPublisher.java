package com.kodilla.patterns.social.publisher;

import com.kodilla.patterns.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Communication by snapchat";
    }
}
