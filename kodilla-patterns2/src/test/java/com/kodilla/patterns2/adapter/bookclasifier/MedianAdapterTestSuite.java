package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Jacek Walkiewicz", "Ikhakima", 2012, "1"));
        bookSet.add(new Book("Kamila Rowinska", "Konieta Niezalezna", 2014, "2"));
        bookSet.add(new Book("Jacek Walkiewicz", "Rozmyslnik", 2016, "3"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(mediana);
        //Then
        assertEquals(mediana, 2014);
    }

}
