package com.company;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private ProductType type;

    public Product(String name, ProductType type){
        this.name=name;
        this.type=type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    @Override
    public int compareTo(Product pro) {
        return this.name.compareTo(pro.name);
    }
}
