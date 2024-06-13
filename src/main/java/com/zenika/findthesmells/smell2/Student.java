package com.zenika.findthesmells.smell2;

public class Student {
    private String name;
    private String address;
    private String email;
    private String currentClass;

    public Student(String name, String address, String email, String currentClass) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.currentClass = currentClass;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }
}
