package animals;

public abstract class Ungulates extends Mammal {
    private boolean parnokopytnyie;

    public Ungulates(int id, int age, double weight,boolean parn){
        super(id, age, weight, mammalType.Ungulates);
        parnokopytnyie=parn;
    }

    public boolean isParnokopytnyie() {
        return parnokopytnyie;
    }

    public void setParnokopytnyie(boolean parnokopytnyie) {
        this.parnokopytnyie = parnokopytnyie;
    }
}
