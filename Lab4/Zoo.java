import animals.*;
import aviaries.Aviary;
import aviaries.BirdAviary;
import aviaries.LionAviary;
import aviaries.UngulatesAviary;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Aviary> aviaries =new ArrayList<Aviary>();

    public Zoo(){
        addAviaries();
    }

    public void addAviary(Aviary aviary){
        aviaries.add(aviary);
    }

    private void addAviaries(){
        BirdAviary birdAviary=new BirdAviary(10000,true);
        UngulatesAviary paraungAviary=new UngulatesAviary(5000,true);
        UngulatesAviary ungAviary=new UngulatesAviary(5000,false);
        LionAviary lionAviary=new LionAviary(1000);
        aviaries.add(birdAviary);
        aviaries.add(paraungAviary);
        aviaries.add(ungAviary);
        aviaries.add(lionAviary);
    }

    public <T extends Animal> String addToAviary(T t)  {

        Object obj=t.getClass();
        if(Eagle.class.equals(obj)){
            aviaries.get(0).addAnimal(t);
            return "Eagle!";
        }
        else if(Zebra.class.equals(obj)){
            aviaries.get(2).addAnimal(t);
            return "Zebra!";
        }
        else if(Lion.class.equals(obj)){
            aviaries.get(3).addAnimal(t);
            return "Lion!";
        }
        else if(Giraffe.class.equals(obj)){
            aviaries.get(1).addAnimal(t);
            return "Giraffe!";
        }
        return "Animal doesn't exist and wasn't added(";
    }

    public <T extends Animal> String removeFromAviary(T t) {
        Object obj=t.getClass();
        if(Eagle.class.equals(obj)){
            aviaries.get(0).removeAnimal(t);
            return "Removed!";
        }
        else if(Zebra.class.equals(obj)){
            aviaries.get(2).removeAnimal(t);
            return "Removed!";
        }
        else if(Lion.class.equals(obj)){
            aviaries.get(3).removeAnimal(t);
            return "Removed!";
        }
        else if(Giraffe.class.equals(obj)){
            aviaries.get(1).removeAnimal(t);
            return "Removed!";
        }
        return "Animal doesn't exist and wasn't removed(";
    }

    public int getCountOfAnimals(){
        int count=0;
        for(Aviary item: aviaries){
            count+=item.getBusyCountPlaces();
        }

        return count;
    }
}

