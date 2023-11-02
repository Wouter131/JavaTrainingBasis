package basisOefeningen;

import java.util.Scanner;

public class IfElseElseIfOefening {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een getal in: ");
        int getal = scanner.nextInt();

        if (getal % 2 == 0) {
            System.out.println("Het getal is even.");
        } else if (getal == 0) {
            System.out.println("Het getal is 0.");
        } else {
            System.out.println("Het getal is oneven.");
        }

        //Oefening:
        //Schrijf hier een programma dat de volgende acties uitvoert:
        //Vraag de gebruiker om zijn leeftijd in te voeren.
        //Als de gebruiker 18 jaar of ouder is, print dan "Je bent meerderjarig."
        //Als de gebruiker jonger dan 18 jaar is, print dan "Je bent minderjarig."


        //Extra uitdaging:
//        Schrijf een programma dat de volgende acties uitvoert:
//
//        Vraag de gebruiker om een getal in te voeren.
//        Als het getal tussen 1 en 10 is, print dan "Het getal is tussen 1 en 10."
//        Als het getal tussen 11 en 20 is, print dan "Het getal is tussen 11 en 20."
//        Als het getal tussen 21 en 30 is, print dan "Het getal is tussen 21 en 30."
//        Als het getal groter dan 30 is, print dan "Het getal is groter dan 30."



    }


}
