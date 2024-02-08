package basisOefeningenUitwerkingen;
import java.util.ArrayList;

//1. Kopieer de eerder gemaakte class ‘ArrayListTesters’ en geef bij het plakken de naam ‘ArrayListTestersWhile’
public class ArrayListTestersWhile {

	public static void main(String[] args) {

		ArrayList<String> testers = new ArrayList<>();

		testers.add("Wouter");
		testers.add("Pieter");
		testers.add("Heleen");
		testers.add("Mark");
		testers.add(2, "Jantine");
		testers.set(1, "Elizabeth");
		testers.remove(4);

		//2. Voeg onderaan (in de main) een int toe die je als teller gebruikt met waarde 0
		int i = 0;
		//3. Voeg dan een while loop toe die loopt zolang de teller kleiner is dan 10. We gaan dus 10 testers toevoegen.
		while (i < 10) {
			//4. Voeg dan in de while loop een tester toe aan de ArrayList met de naam “tester” + het nummer van je teller
			testers.add("tester" + i);
			//5. Hoog dan in je while loop de teller op met 1
			i++;
		}

		//6. Print buiten de while loop de grootte van de ArrayList uit
		System.out.println("Grootte van de ArrayList: " + testers.size());


		//7. Extra: Maak ondersaande while loop af die als doel heeft om alle testers uit te printen. Gebruik de .get(teller)
		int teller = 0;
		while (teller < testers.size()) {
			System.out.println(testers.get(teller));
			teller++;
		}


	}
}
