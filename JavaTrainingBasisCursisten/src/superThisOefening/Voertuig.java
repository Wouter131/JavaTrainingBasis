package superThisOefening;

public class Voertuig {
    protected String merk;

    public Voertuig(String merk) {
        this.merk = merk;
    }

    public void start() {
        System.out.println("Het voertuig start.");
    }
}

