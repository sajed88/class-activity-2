package com.example.class_activity_2.model;

public class Book {
    private  String title;
    private  String authorName;
    private  int pages;

    public Book(String title, String authorName, int pages) {
        this.title = title;
        this.authorName = authorName;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pages=" + pages +
                '}';
    }
}
