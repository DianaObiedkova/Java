package com.company;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CashboxTest {


    @org.junit.jupiter.api.Test
    void showCheck() {
        
        Cashbox cash=new Cashbox();
        cash.AddToCheck(new Product("Milk",ProductType.Diary),5);
        cash.AddToCheck(new Product("Milk",ProductType.Diary),3);
        cash.AddToCheck(new Product("Milk",ProductType.Diary),3);

        cash.AddToCheck(new Product("Watermelon",ProductType.Fruits),9);
        cash.AddToCheck(new Product("Banana",ProductType.Fruits),10);

        Assert.assertEquals("Banana\t10\nMilk\t11\nWatermelon\t9\n",cash.showCheck());
   }
}
