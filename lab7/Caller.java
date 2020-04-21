package com.company;
import java.util.concurrent.Callable;

public class Caller implements Callable<Long> {

    private int count;

    public int getCount() {
        return count;
    }

    public Caller(int count) {
        this.count = count;
    }

    @Override
    public Long call() {

        long counter = 0;
        for (int i = 0; i < getCount(); i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x,2) + Math.pow(y,2) <= 1) {
                counter++;
            }
        }
        return counter;
    }
}