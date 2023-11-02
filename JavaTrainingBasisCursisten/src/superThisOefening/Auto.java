package superThisOefening;

public class Auto extends Voertuig {
    private int deuren;

    public Auto(String merk, int deuren) {
        super(merk);
        this.deuren = deuren;
    }

    public void start() {
        System.out.println("De auto start.");
    }

    public void toonDetails() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Aantal deuren: " + this.deuren);
    }

    public void startSuper() {
        super.start();
    }
}

