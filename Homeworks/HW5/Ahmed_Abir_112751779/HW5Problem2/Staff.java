package com.company;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phone, String email, int office, double salary, int experience, String title) {
        super(name, address, phone, email, office, salary, experience);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return  "\nClass Name: Staff \nName: " + getName();
    }
}
