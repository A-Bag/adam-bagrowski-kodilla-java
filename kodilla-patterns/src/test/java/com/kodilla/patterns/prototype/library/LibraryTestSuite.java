package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Arrange
        Library library = new Library("library1");
        for (int n=1; n<11; n++) {
            library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.now()));
        }

        Library shallowCopiedLibrary = null;
        Library deepCopiedLibrary = null;
        try {
            shallowCopiedLibrary = library.shallowCopy();
            deepCopiedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        shallowCopiedLibrary.setName("library2");
        deepCopiedLibrary.setName("library3");

        //Act
        library.getBooks().remove(new Book("title1", "author1", LocalDate.now()));

        //Assert
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, shallowCopiedLibrary.getBooks().size());
        Assert.assertEquals(10, deepCopiedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowCopiedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepCopiedLibrary.getBooks());
    }
}
