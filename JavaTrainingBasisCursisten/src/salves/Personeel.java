package salves;

public class Personeel {
    int leeftijd;
    String adres;

    public Personeel(int leeftijd, String adres) {
        this.leeftijd = leeftijd;
        this.adres = adres;
    }

    //Sheet 101
    //Voeg aan de class 'Personeel' de volgende methode toe:
    String boodschap(){
        return "Groeten uit de class Personeel";
    }

    String naamClass = "Personeel";
}
