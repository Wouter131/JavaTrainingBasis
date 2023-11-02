package basisOefeningen;

import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {


        try {
            // Code dat een fout kan veroorzaken
        } catch (Exception e) {
            // Handeling bij fout
        }
        finally {
            // Dit blok wordt altijd uitgevoerd. Finally block mag je ook weglaten.
            System.out.println("Dit blok wordt altijd uitgevoerd");
        }

        //Oefening: zet onderstaande code in de try hierboven
        //Zeg tegen de gebruiken in de catch dat deze een getal moet opgeven met een System.out.println()
        //Run de code, en geef een woord op in plaats van een getal
        //Vervang het woord Exception in de catch door de daadwerkelijke exception - dit levert een rode streep op
        //Los de rode streep op door met je muis op de rode streep te gaan staan en kies voor 'Import class'
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een integer getal in: ");
        int getal = scanner.nextInt();

        if (getal % 2 == 0) {
            System.out.println("Het getal is even.");
        } else if (getal == 0) {
            System.out.println("Het getal is 0.");
        } else {
            System.out.println("Het getal is oneven.");
        }



    }


}
