package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculationsTest {


    public List<String> generateUserList(int userQuanitity) {
        List<String> usersList = new ArrayList<String>();

        for (int i = 0; i < userQuanitity; i++) {
            String name = "aaa";
            name = name + i;
            usersList.add( name );
        }

        return usersList;
    }


    @Test
    public void testCalculateAverageCaseNullPosts() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 0 ) );
        when( statisticsMock.postsCount() ).thenReturn( 0 );
        when( statisticsMock.commentsCount() ).thenReturn( 0 );
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 0, calculations.getAveragePostsOfUsers(), 0.001 );


    }

    @Test
    public void testCalculateAverageCaseThusendPosts() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 0 ) );
        when( statisticsMock.postsCount() ).thenReturn( 1000 );
        when( statisticsMock.commentsCount() ).thenReturn( 0 );
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 0, calculations.getAveragePostsOfUsers(), 0.001 );


    }

    @Test
    public void testCalculateAverageCaseCommentsNull() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 10 ) );
        when( statisticsMock.postsCount() ).thenReturn( 20 );
        when( statisticsMock.commentsCount() ).thenReturn( 0 );
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 2, calculations.getAveragePostsOfUsers(), 0.001 );

    }

    @Test
    public void testCalculateAverageCaseLessPostsThanComments() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 2 ) );
        when( statisticsMock.postsCount() ).thenReturn( 10 );
        when( statisticsMock.commentsCount() ).thenReturn( 100);
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 50, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 10, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 5, calculations.getAveragePostsOfUsers(), 0.001 );
    }
    @Test
    public void testCalculateAverageCasemorePostsThanComments() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 10 ) );
        when( statisticsMock.postsCount() ).thenReturn( 100 );
        when( statisticsMock.commentsCount() ).thenReturn( 2);
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 0.2, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 0.02, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 10, calculations.getAveragePostsOfUsers(), 0.001 );
    }
   @Test
   public void testCalculateAverageCaseNullUsers() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 0 ) );
        when( statisticsMock.postsCount() ).thenReturn( 100 );
        when( statisticsMock.commentsCount() ).thenReturn( 100);
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 0, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 1, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 0, calculations.getAveragePostsOfUsers(), 0.001 );
    }
    @Test
    public void testCalculateAverageCaseHundredUsers() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 100 ) );
        when( statisticsMock.postsCount() ).thenReturn( 10 );
        when( statisticsMock.commentsCount() ).thenReturn( 10);
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 0.1, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 1, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 0.1, calculations.getAveragePostsOfUsers(), 0.001 );
    }

    @Test
    public void testCalculateAverageCaseUesrPostsCommentsTheSameValue() {
        //Given
        Calculations calculations = new Calculations();
        Statistics statisticsMock = mock( Statistics.class );
        // When
        when( statisticsMock.usersNames() ).thenReturn( generateUserList( 100 ) );
        when( statisticsMock.postsCount() ).thenReturn( 100 );
        when( statisticsMock.commentsCount() ).thenReturn( 100);
        calculations.calculateAdvStatistics( statisticsMock );
        //Then
        Assert.assertEquals( 1, calculations.getAverageCommmentsOfUsers(), 0.001 );
        Assert.assertEquals( 1, calculations.getAverageCommmentsOfPosts(), 0.001 );
        Assert.assertEquals( 1, calculations.getAveragePostsOfUsers(), 0.001 );
    }
}