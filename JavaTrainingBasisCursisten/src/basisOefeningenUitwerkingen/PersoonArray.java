package basisOefeningenUitwerkingen;

public class PersoonArray {
	 	private String naam;
	    public String getAchternaam() {
			return achternaam;
		}
		private String achternaam;
	    private String woonplaats;
	    private int leeftijd;

	    public PersoonArray() {
	    	System.out.println();
	    }

	    public PersoonArray(String naam, String achternaam, String woonplaats) {
	        this.naam = naam;
	        this.achternaam = achternaam;
	        this.woonplaats = woonplaats;	       
	    }

	    public PersoonArray(String naam, String achternaam, String woonplaats, int leeftijd) {
	        this(naam,achternaam, woonplaats);
	        this.leeftijd = leeftijd;
	    }

	    public String getNaam() {
	        return this.naam;
	    }

	    public String toonNAW () {
	       return this.naam + " " + this.achternaam + " " + this.woonplaats + " " + this.leeftijd;
	    }

	    public void setNaam(String nieuweNaam) {
	        this.naam = nieuweNaam;
	    }

	public static void main(String[] args) {
		    // cursits 1 en 2 bestaan al.
		    PersoonArray cursist1 = new PersoonArray("Luuk", "van Elst", "Zaltbommel", 38);
	        PersoonArray cursist2 = new PersoonArray("Riet", "de Vries", "Lisse", 25);

	       
	        ////1. Maak een Array van type Persoon objecten, het array is 3 groot
	        PersoonArray personen[] = new PersoonArray[3];
			//2. Je hebt eerder de objecten cursist1 en cursist2 aangemaakt.
		    // Geef index 0 van het Array de waarde cursist1, en index 1 de waarde van cursist2
	        personen[0] = cursist1;
	        personen[1] = cursist2;

            //3. Maak een 3e cursist aan en schrijf die weg op index 2.
		    PersoonArray cursist3 = new PersoonArray("Jade", "van Hulst", "Eindhoven", 40);
	        personen[2] = cursist3;

			//4. Print de lengte van het Array uit met .length
	        System.out.println(personen.length);

			//5. Print de NAW gegevens met methode toonNAW() van het object in index 1
	        System.out.println(personen[1].toonNAW());

			//6. Print alleen de achternaam uit van het object in index 2
	        System.out.println(personen[2].achternaam);

			//7. Print de lengte van deze achternaam uit met .length()
	        System.out.println(personen[2].achternaam.length());
	        
	        //8. Clone dit Array in een nieuw array met de methode .clone()
			PersoonArray personen2[] = personen.clone();
	        
	        //9. Print nu dezelfde gegevens als in de regels hierboven, maar dan van het nieuwe array
			System.out.println(personen2.length);
	        System.out.println(personen2[1].toonNAW());
	        System.out.println(personen2[2].achternaam);
	        System.out.println(personen2[2].achternaam.length());
	        
	        
	        
	        
		

	}

}
