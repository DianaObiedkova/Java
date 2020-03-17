import animals.Eagle;
import animals.Giraffe;
import animals.Lion;
import animals.Zebra;

public class Main {
    public static void main(String[] args) throws Exception {

        Zoo zoo=new Zoo();

        Eagle eagle=new Eagle(55,7,5.5);
        Giraffe gir=new Giraffe(44,12,105,3.45);
        Lion lion=new Lion(33,3,50);
        Zebra zebra=new Zebra(12,70.5,15,44);

        System.out.println(zoo.addToAviary(eagle));
        System.out.println(zoo.addToAviary(gir));
        System.out.println(zoo.addToAviary(lion));
        System.out.println(zoo.addToAviary(zebra));

        System.out.println(zoo.getCountOfAnimals());

    }
}
