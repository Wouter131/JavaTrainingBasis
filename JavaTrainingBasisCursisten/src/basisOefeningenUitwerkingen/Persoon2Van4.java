package basisOefeningenUitwerkingen;

public class Persoon2Van4 {
	 	private String naam, achternaam, woonplaats;

		//1.Maak in de class Persoon (boven de main methode) de public String methode getNaam(), deze methode returnt de instance variabele naam
		public String getNaam() {
					return this.naam;
	    }

	    //constructor
	    public Persoon2Van4() {
	    	System.out.println();
	    }

	    public Persoon2Van4(String naam, String achternaam, String woonplaats) {
	        this.naam = naam;
	        this.achternaam = achternaam;
	        this.woonplaats = woonplaats;
	    }

	  //4.Maak in de class Persoon (boven de main methode) de public String methode toonNAW() aan die de instance variabele naam, achternaam en woonplaats returnt (in 1 regel)

	    public String toonNAW () {
	       return this.naam + " " + this.achternaam + " " +
				   "" + this.woonplaats;
	    }


	public static void main(String[] args) {
		   Persoon2Van4 w = new Persoon2Van4("Wouter", "van Praag", "Zaltbommel");

	    	//2.Maak nu in de main methode 2 nieuwe cursisten aan (cursist2 en cursist3) met zelf verzonnen naam, achternaam, woonplaats.
	        Persoon2Van4 cursist2 = new Persoon2Van4("Riet", "de Vries", "Lisse");
	        Persoon2Van4 cursist3 = new Persoon2Van4("Jade", "van Hulst", "Eindhoven");

		    //3.Nu moet onderstaande regel succesvol runnen in de main methode, je vergelijkt hier met de equals() methode of de namen gelijk zijn
	        System.out.println(cursist2.getNaam().equals(cursist3.getNaam()));

			//5.Print nu in de main methode met behulp van de methode toonNAW() de NAW gegevens van de aangemaakte Personen
			System.out.println(w.toonNAW());
			System.out.println(cursist2.toonNAW());
		    System.out.println(cursist3.toonNAW());

	}

}
