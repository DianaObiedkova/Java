package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Cashbox cash=new Cashbox();
        cash.AddToCheck(new Product("Milk",ProductType.Diary),5);
        cash.AddToCheck(new Product("Milk",ProductType.Diary),3);
        cash.AddToCheck(new Product("Milk",ProductType.Diary),3);

        cash.AddToCheck(new Product("Watermelon",ProductType.Fruits),9);
        cash.AddToCheck(new Product("Banana",ProductType.Fruits),10);
        cash.AddToCheck(new Product("Apple",ProductType.Fruits),15);
        cash.AddToCheck(new Product("Buckwheat",ProductType.Cereals),1);


        System.out.println(cash.showCheck());
    }
}
