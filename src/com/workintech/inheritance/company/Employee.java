package com.workintech.inheritance.company;

public class Employee {
    private long id;
    public String name;
    public double salary;

    public Employee(long id, String name) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary <0 ? 0 : salary;
    }
    public void work (){

    }
}


