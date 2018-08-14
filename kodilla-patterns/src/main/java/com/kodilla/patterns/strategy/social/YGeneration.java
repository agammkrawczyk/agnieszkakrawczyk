package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publish.SnapchatPublisher;

public class YGeneration extends  User{
    public YGeneration(String userName) {
        super( userName );
        this.socialPublisher= new SnapchatPublisher();
    }
}
