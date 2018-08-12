package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
   //Given
    Logger logger= new Logger();
    logger.log( "I was here" );
    //When
      String result=  logger.getLastLog();
    //Then
        Assert.assertEquals( "I was here",result );


    }
}