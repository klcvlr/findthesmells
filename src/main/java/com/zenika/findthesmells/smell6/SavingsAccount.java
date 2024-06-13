package com.zenika.findthesmells.smell6;

public class SavingsAccount {
    private double balance;
    private double interestRate;

    public void addInterest() {
        balance += balance * (interestRate / 100);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
    }
}
