package aviaries;

import animals.mammalType;

public abstract class MammalAviary extends Aviary{
    private mammalType mam;
    public MammalAviary( int maxCount, mammalType mam){
        super(maxCount);
        this.mam=mam;
    }

    public mammalType getMam() {
        return mam;
    }

    public void setMam(mammalType mam) {
        this.mam = mam;
    }
}
