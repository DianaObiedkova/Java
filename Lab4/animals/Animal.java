package animals;

public abstract class Animal {
    private int id;
    private int age;
    private double weight;

    public Animal(int id, int age,double weight){
        this.id=id;
        this.age=age;
        this.type=type;
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
