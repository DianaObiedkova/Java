package com.company;

import java.util.Objects;

public class Product {
    private String name;
    private int amount;
    private ProductType type;

    public Product(String name,int amount,ProductType type){
        this.name=name;
        this.amount=amount;
        this.type=type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public boolean equals(final Object other){

        if (this == other)
        {
            return true;
        }
        if (other == null || getClass() != other.getClass())
        {
            return false;
        }
        final Product that = (Product) other;
        return Objects.equals(this.name, that.getName());

    }

    @Override
    public int hashCode(){
        return name!=null?name.hashCode():0;
    }
}
