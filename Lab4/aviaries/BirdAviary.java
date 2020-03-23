package aviaries;

public class BirdAviary extends Aviary {
    private boolean canFly;

    public BirdAviary( int maxCount, boolean fly) {
        super(maxCount);
        canFly = fly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
