package basisOefeningenUitwerkingen;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {


        try {
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
        } catch (InputMismatchException e) {
            System.out.println("Geef een integer getal op!");
        }
        finally {
            // Dit blok wordt altijd uitgevoerd. Finally block mag je ook weglaten.
            System.out.println("Dit blok wordt altijd uitgevoerd");
        }

        //Oefening: zet onderstaande code in de try hierboven
        //Voeg een System.out.println melding toe in de catch
        //Run de code, en geef een woord op in plaats van een getal




    }


}
