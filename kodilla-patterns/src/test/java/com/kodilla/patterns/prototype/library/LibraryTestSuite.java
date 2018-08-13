package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
 @Test
 public void testGetBooks(){
     //Given
     //When

     Library womensLibrary= new Library( "harlekiny" );
     Book book1 = new Book( "Diabel ubiera sie u Prady","Lauren Weisberger",LocalDate.of( 2000,01,01 ) );
     Book book2= new Book( "Portier nosi garnitur od Gabbany","Lauren Weisberger",LocalDate.of( 2005,01,01 ) );
    Book book3 = new Book( "W pogoni za Harrym Winstonem", "Lauren Weisberger",LocalDate.of( 2008,01,01 ) );

   womensLibrary.books.add( book1 );
   womensLibrary.books.add( book2 );
   womensLibrary.books.add( book3 );

System.out.println( womensLibrary.books);
 //Then
     Assert.assertEquals(3, womensLibrary.getBooks().size());
 }


}
