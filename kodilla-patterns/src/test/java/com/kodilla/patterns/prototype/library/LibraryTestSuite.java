package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //When

        Library womensLibrary = new Library( "harlekiny" );
        Book book1 = new Book( "Diabel ubiera sie u Prady", "Lauren Weisberger", LocalDate.of( 2000, 01, 01 ) );
        Book book2 = new Book( "Portier nosi garnitur od Gabbany", "Lauren Weisberger", LocalDate.of( 2005, 01, 01 ) );
        Book book3 = new Book( "W pogoni za Harrym Winstonem", "Lauren Weisberger", LocalDate.of( 2008, 01, 01 ) );

        womensLibrary.books.add( book1 );
        womensLibrary.books.add( book2 );
        womensLibrary.books.add( book3 );

        //Then
        Library clonedLibrary = null;
        try {

            clonedLibrary = womensLibrary.shallowCopy();
            clonedLibrary.setName( "Cloned womens library" );
        } catch (CloneNotSupportedException e) {
            System.out.println( e );
        }

        Library deepClonedLibrary= null;
        try {
            deepClonedLibrary= womensLibrary.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        womensLibrary.books.remove( book1 );
        System.out.println("Womens library after remove" + womensLibrary.books );
        System.out.println( "Cloned library"+  clonedLibrary .books);
        System.out.println( " Deep cloned Library "+ deepClonedLibrary.books );

        Assert.assertEquals( 2, womensLibrary.getBooks().size() );
        Assert.assertEquals( 2, clonedLibrary.getBooks().size() );
        Assert.assertEquals( 3,deepClonedLibrary.getBooks().size() );
    }


}
