package com.company;

public class Book {
    private int wordCount;
    private String bookName, authorName;

    public Book(int wordCount, String bookName, String authorName) {
        this.wordCount = wordCount;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "wordCount=" + wordCount +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
