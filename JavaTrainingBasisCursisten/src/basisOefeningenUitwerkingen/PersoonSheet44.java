package basisOefeningenUitwerkingen;

public class PersoonSheet44 {
	 	private String naam, achternaam, woonplaats;

		//1.Maak in de class Persoon (boven de main methode) de public String methode getNaam(), deze methode returnt de instance variabele naam
		public String getNaam() {
					return this.naam;
	    }

	    //constructor
	    public PersoonSheet44() {
	    	System.out.println();
	    }

	    public PersoonSheet44(String naam, String achternaam, String woonplaats) {
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
		   PersoonSheet44 w = new PersoonSheet44("Wouter", "van Praag", "Zaltbommel");

	    	//2.Maak nu in de main methode 2 nieuwe cursisten aan (cursist2 en cursist3) met zelf verzonnen naam, achternaam, woonplaats.
	        PersoonSheet44 cursist2 = new PersoonSheet44("Riet", "de Vries", "Lisse");
	        PersoonSheet44 cursist3 = new PersoonSheet44("Jade", "van Hulst", "Eindhoven");

		    //3.Nu moet onderstaande regel succesvol runnen in de main methode, je vergelijkt hier met de equals() methode of de namen gelijk zijn
	        System.out.println(cursist2.getNaam().equals(cursist3.getNaam()));

			//5.Print nu in de main methode met behulp van de methode toonNAW() de NAW gegevens van de aangemaakte Personen
			System.out.println(w.toonNAW());
			System.out.println(cursist2.toonNAW());
		    System.out.println(cursist3.toonNAW());

	}

}
