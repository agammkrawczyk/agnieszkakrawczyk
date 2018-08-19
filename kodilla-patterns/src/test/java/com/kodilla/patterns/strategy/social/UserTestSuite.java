package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publish.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mary = new Millenials( "Marry" );
        User sarah = new YGeneration( "Sarah" );
        User mike = new ZGeneration( " Mike" );
        //When
        String maryShare = mary.shareSmoeware();
        System.out.println( "Mary  is a Millenials so she share post on " + maryShare );
        String sarahShare = sarah.shareSmoeware();
        System.out.println( "Sarah  is a YGeneration member so she share post on " + sarahShare );
        String mikeShare = mike.shareSmoeware();
        System.out.println( "Mike is a ZGeneration member so he share post on  " + mikeShare );

        //Then
        Assert.assertEquals( "Facebook", maryShare );
        Assert.assertEquals( "Snapchat", sarahShare );
        Assert.assertEquals( "Twitter", mikeShare );

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User moris = new Millenials( "Moris" );
        //When
        String morisShare = moris.shareSmoeware();
        System.out.println( "Moris is a Millenials so he share post on " + morisShare );
        moris.setPublishingStrategy( new SnapchatPublisher() );
        morisShare = moris.shareSmoeware();
        System.out.println( "Moris changed his mind  and now  he prefer to share post on " + morisShare );
        //Then
        Assert.assertEquals( "Snapchat", morisShare );
    }
}
