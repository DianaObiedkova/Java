package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.*;
import static java.util.Map.Entry.comparingByKey;

public class Cashbox {
    public List<Product> products=new ArrayList<Product>();

    public void AddToCheck(Product product){

        for(var pro:products){
            if(pro.equals(product)){
               pro.setAmount(pro.getAmount()+product.getAmount());
                return;
            }
        }
        products.add(product);
    }

    public String showCheck(){

        sortCheck();

       var wrapper=new Object(){String text="";};
        products.forEach(p->{wrapper.text +=p.getName()+"\t"+p.getAmount()+"\n";} );
        //System.out.println(wrapper.text);

        resetList(products);
        return wrapper.text;
    }

    private void sortCheck(){
        products.sort(Comparator.comparing(Product::getName)
            .thenComparing(Product::getAmount));
    }

    private void resetList(List<Product> pros){
        pros.removeAll(pros);
    }
}
