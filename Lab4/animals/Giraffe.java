package animals;

public class Giraffe extends Ungulates {
    private double neckHeight;
    public Giraffe(int id, int age, double weight, double neck){
        super(id, age, weight,true);
        neckHeight=neck;
    }

    public double getNeckHeight() {
        return neckHeight;
    }

    public void setNeckHeight(double neckHeight) {
        this.neckHeight = neckHeight;
    }
}
