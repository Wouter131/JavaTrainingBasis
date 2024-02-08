package basisOefeningenUitwerkingen;
import java.util.ArrayList;
//1. Kopieer de eerder gemaakte class ‘ArrayListTestersFor’ en geef bij het plakken de naam ‘ArrayListTestersForEach’
public class ArrayListTestersForEach {

	public static void main(String[] args) {

		ArrayList<String> testers = new ArrayList<>();

		testers.add("Wouter");
		testers.add("Pieter");
		testers.add("Heleen");
		testers.add("Mark");
		testers.add(2, "Jantine");
		testers.set(1, "Elizabeth");
		testers.remove(4);
		
		//2. Print nu alle namen van de ArrayList uit met behulp van een for each loop
		for (String s : testers) {			
			System.out.println(s);
			//Is het mogelijk om in de for each loop de remove() methode te gebruiken?
            //Nee als je onderstaande runt krijg je een 'java.util.ConcurrentModificationException'
			//testers.remove(1);
            //testers.add("tester");
		}

	}
	
	

}
