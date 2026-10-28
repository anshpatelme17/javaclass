package com.example;

public class Complaint {
    private int id;
    private String description;
    private String category;
    private String status;

    public Complaint() {
    }

    public Complaint(int id, String description, String category) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.status = "PENDING";
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

