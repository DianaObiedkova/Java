package com.company;

public class Bank {
    public void transfer(Account from, Account to, double count) {

        Account max,min;

        if(from.getNumber()>to.getNumber()){
            max=from;
            min=to;
        }
        else{
            min=from;
            max=to;
        }


        synchronized (max) {
            synchronized (min) {
                if (from.getBalance() >= count) {
                    from.minus(count);
                    to.plus(count);
                } else {
                    System.out.println("Not enough money in the account for transfering: " + from.getNumber() + " " + from.getBalance());
                }
            }
        }
    }
}
