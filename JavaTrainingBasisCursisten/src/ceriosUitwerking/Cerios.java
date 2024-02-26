package ceriosUitwerking;
//2. Voeg een class toe aan het package met de naam ‘Cerios’ (zonder main() methode)
public class Cerios {
    //3. Geef de class Cerios de instance variabele int leeftijdTester en String naamTester
    int leeftijdTester;
    String naamTester;

    //4.Maak een constructor die 2 argumenten verwacht en de opgegeven waarden in leeftijdTester en adresTester wegschrijft
    // (tip! laat IntelliJ dit voor je doen via: rechtermuisknop – generate - constructor)
    public Cerios(int leeftijdTester, String naamTester) {
        this.leeftijdTester = leeftijdTester;
        this.naamTester = naamTester;
    }

   //8. Voeg in de class ‘Cerios’ een Getter methodes toe. Laat IntelliJ dit voor je doen via: rechtermuisknop – generate – Getter
    public int getLeeftijdTester() {
        return leeftijdTester;
    }

    public String getNaamTester() {
        return naamTester;
    }


}
