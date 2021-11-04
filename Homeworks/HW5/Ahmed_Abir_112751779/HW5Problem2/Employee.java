package com.company;

public class Employee extends Person{
    private int office;
    private double salary;
    private int experience;

    public Employee(String name, String address, String phone, String email, int office, double salary, int experience) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.experience = experience;
    }

    int getOffice(){
        return office;
    }

    double getSalary(){
        return salary;
    }

    int getExperience(){
        return experience;
    }

   void setOffice(int office) {
        this.office = office;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

   void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return  "\nClass Name: Employee \nName: " + getName();
    }
}
