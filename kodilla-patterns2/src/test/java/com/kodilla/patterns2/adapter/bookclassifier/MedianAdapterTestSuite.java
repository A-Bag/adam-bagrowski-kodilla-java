package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author1", "title1", 2000, "abc123"));
        bookSet.add(new Book("author2", "title2", 1998, "abc124"));
        bookSet.add(new Book("author3", "title3", 2002, "abc125"));
        bookSet.add(new Book("author4", "title4", 1996, "abc126"));
        bookSet.add(new Book("author5", "title5", 2004, "abc127"));
        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2000, medianPublicationYear);
    }
}
