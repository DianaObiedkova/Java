import animals.*;
import aviaries.Aviary;
import aviaries.BirdAviary;
import aviaries.LionAviary;
import aviaries.UngulatesAviary;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

public class Zoo {
    public List<Aviary> aviaries =new ArrayList<Aviary>();
    //public List<String> strings=new ArrayList<String>();
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

    public <T extends Animal> Boolean addToAviary(T t) throws Exception {

        Field aviaryListField=Zoo.class.getDeclaredField("aviaries");
        ParameterizedType aviaryListType=(ParameterizedType)aviaryListField.getGenericType();
         Class<?> aviaryListClass=(Class<?>)aviaryListType.getActualTypeArguments()[0];
        System.out.println(aviaryListClass);

        if(t instanceof Eagle){

            aviaries.get(0).addAnimal(t);
            return true;
        }
        else if(t instanceof Zebra){
            aviaries.get(2).addAnimal(t);
            return true;
        }
        else if(t instanceof Lion){
            aviaries.get(3).addAnimal(t);
            return true;
        }
        else if(t instanceof Giraffe){
            aviaries.get(1).addAnimal(t);
            return true;
        }

        throw new Exception( "Animal doesn't exist and wasn't added(");
    }

    public <T extends Animal> Boolean removeFromAviary(T t) throws Exception {

        if(t instanceof Eagle){
            aviaries.get(0).removeAnimal(t);
            return true;
        }
        else if(t instanceof Zebra){
            aviaries.get(2).removeAnimal(t);
            return true;
        }
        else if(t instanceof Lion){
            aviaries.get(3).removeAnimal(t);
            return true;
        }
        else if(t instanceof Giraffe){
            aviaries.get(1).removeAnimal(t);
            return true;
        }
        throw new Exception("Animal doesn't exist and wasn't removed(");
    }

    public int getCountOfAnimals(){
        int count=0;
        for(Aviary item: aviaries){
            count+=item.getBusyCountPlaces();
        }

        return count;
    }
}

