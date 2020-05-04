package com.company;

public class Account {
    private double balance;
    private long number;

    public Account(long number){
        this.number=number;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public synchronized void withdraw(double count){
        balance-=count;
    }

    public synchronized void deposit(double count){
        balance+=count;
    }
}
