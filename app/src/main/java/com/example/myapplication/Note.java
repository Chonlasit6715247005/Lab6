package com.example.myapplication;

public class Note {
    private String title;
    private String createdDate;

    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    // Encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    // Polymorphism
    public String display() {
        return "Note: " + title + " (" + createdDate + ")";
    }
}
