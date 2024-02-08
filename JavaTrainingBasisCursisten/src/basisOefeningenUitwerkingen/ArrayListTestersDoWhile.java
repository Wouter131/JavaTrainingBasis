package basisOefeningenUitwerkingen;

import java.util.ArrayList;

//1. Kopieer de eerder gemaakte class ‘ArrayListTestersWhile’ en geef bij het plakken de naam ‘ArrayListTestersDoWhile’
public class ArrayListTestersDoWhile {

    public static void main(String[] args) {

        ArrayList<String> testers = new ArrayList<>();
        testers.add("Wouter");
        testers.add("Pieter");
        testers.add("Heleen");
        testers.add("Mark");
        testers.add(2, "Jantine");
        testers.set(1, "Elizabeth");
        testers.remove(4);

        //2. Maak van de eerder gemaakte while constructie een do while constructie
        int i = 0;

        do {
            testers.add("tester" + i);
            i++;
        } while (i < 10);


        //3 .Pas daarna in deze class en in de class ArrayListTestersWhile het while statement aan naar i < 0

        do {
            testers.add("tester" + i);
            i++;
        } while (i < 0);

        //4. Run beide applicaties. Wat is het verschil? Hoe komt dat?
        //Antwoord: in de While applicatie wordt geen tester toegevoegd en in de do while wel

        System.out.println(testers.size());

    }

}
