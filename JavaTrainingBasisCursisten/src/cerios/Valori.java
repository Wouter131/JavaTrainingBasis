package cerios;
//5. Voeg nog 3 classes toe aan het package cerios met de namen ‘Valori’, ‘Salves’ en ‘DeAgileTesters’
// die de class Cerios extends. Laat IntelliJ steeds de constructor genereren
public class Valori extends Cerios{


    //10. Men wil specifiek van het ‘Valori’ personeel weten wat hun lievelings stad in Europa is,
    // zodat daar met de weekendjes weg rekening mee kan worden houden. Voeg alleen aan de class ‘Valori’ de instance variabele
    // String favorieteStadEuropa toe.
    // Laat een extra constructor aanmaken die ook deze nieuwe String vult.
    String favorieteStadEuropa;

    public Valori(int leeftijdTester, String naamTester, String favorieteStadEuropa) {
        super(leeftijdTester, naamTester);
        this.favorieteStadEuropa = favorieteStadEuropa;
    }

    public Valori(int leeftijdTester, String naamTester) {
        super(leeftijdTester, naamTester);
    }



}
