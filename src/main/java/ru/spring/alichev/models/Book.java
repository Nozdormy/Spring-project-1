package ru.spring.alichev.models;

import javax.validation.constraints.NotNull;

public class Book {

    private int id;

    @NotNull(message = "Name of the book should be not empty")
    private String bookName;

    @NotNull(message = "Author of the book should be not empty")
    private String authorBook;

    @NotNull(message = "Year of issue should be not empty")
    private int yearOfIssue;

    public Book() {
    }

    public Book(String bookName, String authorBook, int yearOfIssue) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
