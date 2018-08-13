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
     // Creating books
     Library studentsLibrary= new Library( "Kodilla Library" );
     IntStream.iterate(1, n -> n + 1)
             .limit(5)
             .forEach(n ->studentsLibrary.getBooks().add(new Book( " title","autor",LocalDate.of(2000,01,01))));
 System.out.println(studentsLibrary);
 //Then
     Assert.assertEquals(5, studentsLibrary.getBooks().size());
 }
}
