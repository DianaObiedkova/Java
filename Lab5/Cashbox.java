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
        //showProducts(products);
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
       // pros.forEach((k,v)->System.out.println(k.getName()+"\t"+v+"\n"));
    }

    private void resetList(Map<Product,Integer> pros){
        pros.clear();
    }
}

//products.sort(Comparator.comparing(Product::getName)
//    .thenComparing(Product::getAmount));


/*
                List<Product> temp=products;
                temp.stream()
                        //.filter(p->p.equals(product))
                        .forEach(p->{
                            if(p.getName()==product.getName())
                                p.setAmount(p.getAmount()+product.getAmount());});
                products.remove(pro);
                products.addAll(temp);

                */

/*
        if(!products.contains(product))
             products.add(product);
        else{
            products.stream()
                    //.filter(product1 -> product1.getName()==product.getName())
                    .forEach(p->{
                        if(p.getName()==product.getName())
                            p.setAmount(p.getAmount()+product.getAmount());});
        }

 */


//Sorting by Key


/*
        List<Product> temp=products;
        temp.stream()
                //.filter(p->p.equals(product))
                .forEach(p->{
                    if(p.getName()==product.getName())
                        p.setAmount(p.getAmount()+product.getAmount());});
        products.remove(pro);
        products.addAll(temp);



 */

//-------------
//Properties properties = System.getProperties();
//Set<Map.Entry<Object, Object>> entries = properties.entrySet();

//ArrayList<Product> sortedkeys=new ArrayList<Product>(products.keySet());
//Collections::sort(sortedkeys)


//LinkedHashMap<Product,Integer> sortedmap=new LinkedHashMap<>();
          /*      .collect(Collectors.toMap(k -> (String) k.getKey(), e -> (String) e.getValue()))
                .entrySet()
                .stream()
                .sorted(Entry.comparingByKey())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

         */
          /*
        products.entrySet()
                .stream()
                .sorted(comparingByKey(Comparator.comparing(obj->obj.getName())))
                .forEachOrdered(x->sortedmap.put(x.getKey(),x.getValue()));


           */
/*
       Map<Product,Integer> proMap=products.stream()
               .collect(Collectors.toMap(Product::getName, Function.identity()));
        TreeMap<Product, Integer> sorted = new TreeMap<>();
*/
//sortedmap.putAll(products);


// rollCall.forEach((k,v)->System.out.println(k.getName()+"\t"+v+"\n"));

//products.putAll(rollCall);
/*
        products.forEach((k,v)->{
            if(k.equals(product)) {
                addValue(products,product,count);
                //products.put(k,v+count);
                //v=v+count;
                System.out.println(v);
               // products.put(product,v+count);

                //showProducts();
                return;
            }
        });


 */
// showProducts();
        /*
        for(var pro:products){
            if(pro.equals(product)){
               pro.setAmount(pro.getAmount()+product.getAmount());
                return;
            }
        }
        products.add(product);

         */
/*
        for(int i=0; i<products.size();i++){
            if(products.get(produc))
        }

 */