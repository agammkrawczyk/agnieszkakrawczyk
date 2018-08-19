package com.kodilla.patterns.singleton;

        import org.junit.Assert;
        import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log( "I was here" );
        //When
        String result=Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals( "I was here",result );


    }
}