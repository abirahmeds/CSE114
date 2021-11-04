package com.company;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, int office, double salary, int experience, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, experience);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return  "\nClass Name: Faculty \nName: " + getName();
    }
}
