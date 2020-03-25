package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Cashbox cash=new Cashbox();
        cash.AddToCheck(new Product("Milk",3,ProductType.Diary));
        cash.AddToCheck(new Product("Milk",2,ProductType.Diary));
        cash.AddToCheck(new Product("Milk",3,ProductType.Diary));

        cash.AddToCheck(new Product("Watermelon",9,ProductType.Fruits));
        cash.AddToCheck(new Product("Banana",10,ProductType.Fruits));

        System.out.println(cash.showCheck());
    }
}
