package cerios;
//6. Voeg nu een nieuwe class ‘TestClass’ toe met main methode
public class TestClass {


    public static void main(String[] args) {
        //7. Maak in de main methode een object ‘Cerios’, ‘Salves’, ‘Valori’ en ‘DeAgileTesters’ aan.
        // Vergeet niet een leeftijd en naam mee te geven voor de constructor.
        Cerios ceriosTester = new Cerios(60, "Jantje Serieus");
        Salves salvesTester = new Salves(50, "Piet Salvie");
        Valori valoriTester = new Valori(40, "Klaas Val");
        DeAgileTesters datTester = new DeAgileTesters(30, "Guus Agil");


        //9. Roep nu in de TestClass voor al je objecten de GetNaamTester() methode aan in een System.out.println()
        System.out.println(ceriosTester.getNaamTester());
        System.out.println(salvesTester.getNaamTester());
        System.out.println(valoriTester.getNaamTester());
        System.out.println(datTester.getNaamTester());

        //11. Maak in de Testclass een nieuw ‘Valori’ object aan die deze nieuwe constructor aanroept.
        Valori valoriTester2 = new Valori(40, "Jan Valloria", "Lissabon");

        //12. Is het mogelijk om een ‘Salves’ object aan te maken die deze nieuwe ‘Valori’ constructor aanroept?
        //Antwoord: Nee, de class 'Salves' 'weet' niet van het bestaan van de class 'Valori' af

        //13. Wat zou de beste oplossing zijn als ineens alle bv’s gebruik willen maken van deze nieuwe variabele?
        //Antwoord: verhuizen naar de super class 'Cerios'

        System.out.println(valoriTester.naamTester);

    }

}
