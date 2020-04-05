package com.company;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.*;
import static java.util.Map.Entry.comparingByKey;

public class Cashbox {
    HashMap<Product, Integer> products=new HashMap<>();
    TreeMap<Product,Integer> sortedProducts;

    public void AddToCheck(Product product, int count) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equals(product)) {
                value+=count;
                products.put(key,value);
                return;
            }
        }
        products.put(product, count);

    }
    /*
    private static void addValue(Map<Product,Integer> pros,Product pro,int value){
        Integer v=pros.get(pro);
        pros.put(pro,v=value);
    }

     */
    public String showCheck(){

        sortValueCheck();
        sortKey();

       String text=showProducts(sortedProducts);

        resetList(products);
        resetList(sortedProducts);
        return text;
    }

    private void sortValueCheck() {

       // Sorting by value
        LinkedList<Entry<Product, Integer>> list = new LinkedList<Entry<Product, Integer>>(products.entrySet());

        Collections.sort(list, new Comparator<Entry<Product, Integer>>() {
            public int compare(Entry<Product, Integer> o1, Entry<Product, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Product, Integer> sortedMap = new HashMap<Product, Integer>();
        for (Entry<Product, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        products.clear();
        products.putAll(sortedMap);
    }

    private void sortKey(){
       sortedProducts = new TreeMap<Product, Integer>();
            sortedProducts.putAll(products);
        showProducts(sortedProducts);

    }

    private String showProducts(Map<Product,Integer> pros){
        var wrapper=new Object(){String text="";};
        sortedProducts.forEach((k,v)->{wrapper.text +=k.getName()+"\t"+v+"\n";} );
        return wrapper.text;
    }

    private void resetList(Map<Product,Integer> pros){
        pros.clear();
    }
}
