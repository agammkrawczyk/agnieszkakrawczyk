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
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n ->womensLibrary.getBooks().add(new Book( " aaa","bbb",LocalDate.of(2000,01,01))));

        Book bookToRemove = new Book("aaa", "bbb", LocalDate.now());
        womensLibrary.getBooks().add( bookToRemove );

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


        womensLibrary.getBooks().remove( bookToRemove );

        System.out.println("Womens library after remove" + womensLibrary.getBooks() );
        System.out.println( "Cloned library"+  clonedLibrary .getBooks());
        System.out.println( " Deep cloned Library "+ deepClonedLibrary.getBooks() );

        Assert.assertEquals( 3, womensLibrary.getBooks().size() );
        Assert.assertEquals( 3, clonedLibrary.getBooks().size() );
        Assert.assertEquals( 4,deepClonedLibrary.getBooks().size() );
    }


}
