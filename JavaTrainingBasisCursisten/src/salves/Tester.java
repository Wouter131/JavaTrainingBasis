package salves;

public class Tester extends Personeel {
    boolean javaErvaring;

    public Tester(int leeftijd, String adres, boolean javaErvaring) {
        super(leeftijd, adres);
        this.javaErvaring = javaErvaring;
    }

    //Sheet 101
    String boodschap(){
        return "Groeten uit de class Tester";
    }


    String naamClass = "Tester";
}
