package aviaries;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Aviary {
    private int maxCountPlaces;
    private int busyCountPlaces;
    private int[] cages;

    private List<Animal> animals=new ArrayList<>(maxCountPlaces);

    public <T extends Animal> Aviary( int maxCount){
        maxCountPlaces=maxCount;
        busyCountPlaces=0;
        cages=new int[maxCount];
    }

    public int getMaxCountPlaces() {
        return maxCountPlaces;
    }

    public int getBusyCountPlaces() {
        return busyCountPlaces;
    }

    public  Boolean addAnimal(Animal animal) throws Exception {


        if (maxCountPlaces - busyCountPlaces != 0) {

            busyCountPlaces++;
            cages[busyCountPlaces]=animal.getId();

            animals.add(animal);
            return true;
        }

        throw new Exception("We have some troubles... There aren't any empty aviaries(((");
        //return "We have some troubles... There aren't any empty aviaries(((";
    }

    public Boolean removeAnimal(Animal animal) throws Exception {

        for(int i=0; i<cages.length;i++){

            if(cages[i]==animal.getId()) {
                busyCountPlaces--;
                animals.remove(animal);

                return true;
            }
        }

        throw new Exception("There was a problem with removal...");
        //return "There was a problem with removal...";
    }

}
