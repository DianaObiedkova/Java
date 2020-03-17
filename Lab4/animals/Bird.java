package animals;

public abstract class Bird extends Animal {
    private boolean canFly;

    public Bird(int id, int age, double weight, boolean fly){
        super(id, age, weight, AnimalType.Bird);
        canFly=fly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
