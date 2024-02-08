package basisOefeningenUitwerkingen;


import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileTryCatch {


    public static void main(String[] args) {


        boolean isInteger = false;

        while (!isInteger) {

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

                isInteger = true;
            } catch (InputMismatchException e) {
                System.out.println("Geef een integer getal op!");
            }
        }



    }


}