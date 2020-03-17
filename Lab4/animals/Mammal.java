package animals;

public abstract class Mammal extends Animal{
    private mammalType mamType;

    public Mammal(int id, int age, double weight, mammalType mamtype){
        super(id, age, weight,AnimalType.Mammal);
        this.mamType=mamType;
    }

    public mammalType getMamType() {
        return mamType;
    }

    public void setMamType(mammalType mamType) {
        this.mamType = mamType;
    }
}
