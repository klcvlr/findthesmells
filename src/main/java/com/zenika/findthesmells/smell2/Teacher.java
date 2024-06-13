package com.zenika.findthesmells.smell2;

public class Teacher {
    private String name;
    private String address;
    private String email;
    private Long salary;

    public Teacher(String name, String address, String email, Long salary) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }
}
