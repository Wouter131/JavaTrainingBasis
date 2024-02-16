package basisOefeningenUitwerkingen;

public class Persoon3Van4 {
	 	private String naam, achternaam, woonplaats;
	    public String getAchternaam() {
			return achternaam;
		}

		//1.Kun je nu ook int leeftijd toevoegen als instance variabele en overal waar nodig implementeren in de code?
	    private int leeftijd;


	    public Persoon3Van4() {
	    	System.out.println();
	    }


	    public Persoon3Van4(String naam, String achternaam, String woonplaats) {
	        this.naam = naam;
	        this.achternaam = achternaam;
	        this.woonplaats = woonplaats;
	    }
	  //1.Kun je nu ook int leeftijd toevoegen als instance variabele en overal waar nodig implementeren in de code?
	    public Persoon3Van4(String naam, String achternaam, String woonplaats, int leeftijd) {
	        this(naam,achternaam, woonplaats);
	        this.leeftijd = leeftijd;
	    }
	    

	    public String getNaam() {
	        return this.naam;
	    }
	    
	  //1.Kun je nu ook int leeftijd toevoegen als instance variabele en overal waar nodig implementeren in de code?
	    public String toonNAW () {
	       return this.naam + " " + this.achternaam + " " + this.woonplaats + " " + this.leeftijd;
	    }
	    //2.Maak nu in de class Persoon (boven de main methode) de public void methode setNaam met als methode parameter een String.
	    public void setNaam(String nieuweNaam) {
			this.naam = nieuweNaam;
	    }

	public static void main(String[] args) {



		    //1.Kun je nu ook int leeftijd toevoegen als instance variabele en overal waar nodig implementeren in de code? Onderstaande regel
		    //moet succesvol kunnen runnen in de main methode:
		    Persoon3Van4 cursist5 = new Persoon3Van4("Wouter", "van Praag", "Zaltbommel", 38);

		    //4. (vooraf) Controleer met behulp van de methode getNaam() en toonNAW() of de wijziging juist is doorgevoerd voor cursist5
		    System.out.println(cursist5.getNaam());
		    System.out.println(cursist5.toonNAW());

	      //3.Pas nu van een aangemaakt Persoon met deze setNaam methode de naam aan.
	        cursist5.setNaam("Bob");
			//4. (achteraf) Controleer met behulp van de methode getNaam() en toonNAW() of de wijziging juist is doorgevoerd
	        System.out.println(cursist5.getNaam());
	        System.out.println(cursist5.toonNAW());
	        

	}

}
