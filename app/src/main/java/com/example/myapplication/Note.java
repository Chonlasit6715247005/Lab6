package com.example.myapplication;

public class Note {
    public String title;
    public String createdDate;
    private User owner;

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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    // Polymorphism
    public String display() {
        String ownerInfo = (owner != null) ? "\nOwner: " + owner.getName() + " (ID: " + owner.getUserId() + ")" : "\nOwner: Unknown";
        return "Note: " + title + " (" + createdDate + ")" + ownerInfo;
    }
}
