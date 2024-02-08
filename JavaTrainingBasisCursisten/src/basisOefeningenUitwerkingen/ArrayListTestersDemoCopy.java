package basisOefeningenUitwerkingen;
import java.util.ArrayList;

public class ArrayListTestersDemoCopy {

	public static void main(String[] args) {
		
		//Creëer in de main een ArrayList van Strings met de naam ‘testers’
		ArrayList<String> testers = new ArrayList<>();
		
		//Voeg met .add() 4 namen van testers toe		
		testers.add("Wouter");
		testers.add("Pieter");
		testers.add("Heleen");
		testers.add("Mark");
		
		//Print de grootte  van de ArrayList uit met .size()
		System.out.println(testers.size());
		
		//Voeg op index 2 een nieuwe tester in met .add(index, “value”);
		testers.add(2, "Jantine");
		
		//Print de groote van de ArrayList opnieuw uit
		System.out.println(testers.size());
		
		//Vervang de 2e tester uit de ArrayList met .set(index, “value”);
		testers.set(1,  "Elizabeth");
		
		//Print nu de naam van deze tester uit met .get(index);
		System.out.println(testers.get(1));
		
		//Print de index uit van de zojuist vervangen tester met .indexOf("value");
		System.out.println(testers.indexOf("Elizabeth"));
		
		//Achterhaal de grootte van de ArrayList met .size()
		System.out.println(testers.size());
		
		//Verwijder de laatste tester van de ArrayList met .remove(index)
		testers.remove(4);
		
		//Print nu alle testers uit: index 0 bevat tester .get(index) met 1 System.out, maar wel alle testers op een nieuwe regel met \n
		System.out.println("index 0 bevat tester " + testers.get(0) + 
				"\nindex 1 bevat tester " + testers.get(1)+ 
				"\nindex 2 bevat tester " + testers.get(2)+ 
				"\nindex 3 bevat tester " + testers.get(3));
		
		

	}

}
