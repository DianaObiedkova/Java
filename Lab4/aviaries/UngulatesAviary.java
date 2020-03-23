package aviaries;

import animals.mammalType;

public class UngulatesAviary extends MammalAviary {
    private boolean parnokopyta;
    public UngulatesAviary(int maxCount, boolean para){
        super(maxCount, mammalType.Ungulates);
        parnokopyta=para;
    }

    public boolean isParnokopyta() {
        return parnokopyta;
    }

    public void setParnokopyta(boolean parnokopyta) {
        this.parnokopyta = parnokopyta;
    }
}
