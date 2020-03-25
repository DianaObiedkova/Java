package com.company;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CashboxTest {


    @org.junit.jupiter.api.Test
    void showCheck() {
        Cashbox cash=new Cashbox();
        cash.AddToCheck(new Product("Milk",3,ProductType.Diary));
        cash.AddToCheck(new Product("Milk",2,ProductType.Diary));
        cash.AddToCheck(new Product("Milk",3,ProductType.Diary));

        cash.AddToCheck(new Product("Watermelon",9,ProductType.Fruits));
        cash.AddToCheck(new Product("Banana",10,ProductType.Fruits));

        Assert.assertEquals("Banana\t10\nMilk\t8\nWatermelon\t9\n",cash.showCheck());


    }
}