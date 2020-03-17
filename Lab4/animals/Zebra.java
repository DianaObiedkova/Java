package animals;

public class Zebra extends Ungulates {
    private int stripsNumber;

    public Zebra(int id, double weight, int age, int stripsNumber){
        super(id, age, weight, false);
        this.stripsNumber=stripsNumber;
    }

    public int getStripsNumber() {
        return stripsNumber;
    }

    public void setStripsNumber(int stripsNumber) {
        this.stripsNumber = stripsNumber;
    }
}
