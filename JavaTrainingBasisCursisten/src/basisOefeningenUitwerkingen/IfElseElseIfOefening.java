package basisOefeningenUitwerkingen;

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


        //Schrijf hier een programma dat de volgende acties uitvoert:
        //Vraag de gebruiker om zijn leeftijd in te voeren.
        //Als de gebruiker 18 jaar of ouder is, print dan "Je bent meerderjarig."
        //Als de gebruiker jonger dan 18 jaar is, print dan "Je bent minderjarig."

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Voer uw leeftijd in: ");
        int leeftijd = scanner2.nextInt();

        if (leeftijd >= 18) {
            System.out.println("Je bent meerderjarig.");
        } else {
            System.out.println("Je bent minderjarig.");
        }


        //Extra uitdaging:
//        Schrijf een programma dat de volgende acties uitvoert:
//
//        Vraag de gebruiker om een getal in te voeren.
//        Als het getal tussen 1 en 10 is, print dan "Het getal is tussen 1 en 10."
//        Als het getal tussen 11 en 20 is, print dan "Het getal is tussen 11 en 20."
//        Als het getal tussen 21 en 30 is, print dan "Het getal is tussen 21 en 30."
//        Als het getal groter dan 30 is, print dan "Het getal is groter dan 30."

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Voer een getal in: ");
        int getalletje = scanner3.nextInt();

        if (getalletje >= 1 && getalletje <= 10) {
            System.out.println("Het getal is tussen 1 en 10.");
        } else if (getalletje >= 11 && getalletje <= 20) {
            System.out.println("Het getal is tussen 11 en 20.");
        } else if (getalletje >= 21 && getalletje <= 30) {
            System.out.println("Het getal is tussen 21 en 30.");
        } else {
            System.out.println("Het getal is groter dan 30.");
        }






    }


}
