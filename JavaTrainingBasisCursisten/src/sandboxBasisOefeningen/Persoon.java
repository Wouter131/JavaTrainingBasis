package sandboxBasisOefeningen;

public class Persoon {	 	
	    
	    //constructor zonder argumenten
	    public Persoon() {	    
	    }       
	   
	public static void main(String[] args) {
		
			//We instanties van de class Persoon aanmaken. Dit zijn personen met naam, achternaam en woonplaats.
			//Opdracht:maak in de class Persoon 3 instance variabelen aan van het type String: naam, achternaam en woonplaats
			//Er staat al een constructor in de class Persoon zonder parameters, maak nu een extra constructor aan
		    //die 3 String parameters verwacht (je mag de naam van de constructor parameters zelf bepalen)
	        //schrijf de String constructor parameters weg in de juiste instance variabelen (naam, achternaam, woonplaats) hint: gebruik in de constructor this.naam = verzonnen constructor parameter voor naam;
		
		    //Nu moet onderstaande regel succesvol kunnen runnen:
		
//             Persoon cursist1 = new Persoon("Wouter", "van Praag", "Zaltbommel");
		
			//Maak in de class Persoon de public String methode getNaam(), deze methode returnt de instance variabele naam		
			//Maak nu 2 nieuwe cursisten aan (cursist2 en cursist3) met zelf verzonnen naam, achternaam, woonplaats. 
			//Nu moet onderstaande regel succesvol runnen, je vergelijkt hier met de equals() methode of de namen gelijk zijn
		
//			System.out.println(cursist2.getNaam().equals(cursist3.getNaam()));
		
			//Maak in de class Persoon de public String methode toonNAW() aan die de instance variabele naam, achternaam en woonplaats returnt (in 1 regel)
		
		
			//Print nu met behulp van de methode toonNAW() de NAW gegevens van de aangemaakte Personen
		
			//Kun je nu ook int leeftijd toevoegen als instance variabele en overal waar nodig implementeren in de code? Onderstaande regel
		    //moet succesvol kunnen runnen
		
		    // Persoon cursist1 = new Persoon("Wouter", "van Praag", "Zaltbommel", 38);
		
			//Maak nu in de class Persoon de public void methode setNaam met als methode parameter een String.
		    //Pas nu van cursist1 met deze setNaam methode de naam aan.
		    //Controleer met behulp van de methode getNaam() en toonNAW() of de wijziging juist is doorgevoerd voor cursist1
		
		
		
		
		  //Opdracht na hoofdstuk Array (5)
		  //Maak een Array van type Persoon objecten, het array is 3 groot
		  //Je hebt eerder de objecten cursist1 en cursist2 aangemaakt. Geef index 0 van het Array de waarde cursist1, en index 1 de waarde van cursist2
		  //Maak een 3e cursist aan en schrijf die weg op index 3.
		  //Print de lengte van het Array uit met .length
		  //Print de NAW gegevens met methode toonNAW() van het object in index 1
		  //Print alleen de achternaamuit van het object in index 2
		  //Print de lengte van deze achternaam uit met .length()
		  //Cloon dit Array in een nieuw array met de methode .clone()
		  //Print nu dezelfde gegevens als in de regels hierboven, maar dan van het nieuwe array
		
		
		
		
		
	}

}
