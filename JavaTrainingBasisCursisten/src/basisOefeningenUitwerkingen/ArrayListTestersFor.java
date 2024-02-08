package basisOefeningenUitwerkingen;
import java.util.ArrayList;
//1. Kopieer de eerder gemaakte class ‘ArrayListTestersDoWhile’ en geef bij het plakken de naam ‘ArrayListTestersFor’
public class ArrayListTestersFor {

	public static void main(String[] args) {

		ArrayList<String> testers = new ArrayList<>();

		testers.add("Wouter");
		testers.add("Pieter");
		testers.add("Heleen");
		testers.add("Mark");
		testers.add(2, "Jantine");
		testers.set(1, "Elizabeth");
		testers.remove(4);

//		int i = 0;
//		do {
//			testers.add("tester" + i);
//			i++;
//		} while (i < 10);

		//2. Bouw de do while loop om tot for loop, er moet weer geloopt worden zolang de size van de ArrayList kleiner is dan 10.
		// Let op! Dit is een kopieer & plak oefening. Zet alles van de do while loop in de for loop op de juiste plek.
		for(int i = 0; i < 10; i++){
			testers.add("tester" + i);
		}


		System.out.println(testers.size());

		
	

	}

}
