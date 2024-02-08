package beestenboelUitwerking;

public class TestDier {

	public static void main(String[] args) {
//		Initieer een new Vogel() object als een Dier met een zelfgekozen naam, vergeet niet de 4 argumenten mee te geven die de Vogel constructor verwacht
//		Print van dier de kenmerken uit met de methode kenmerken(). Dit dier is tam.
		
//		Initieer een new Vogel() object als een Vogel met een zelf gekozen naam, vergeet niet de 4 argumenten mee te geven die de Vogel constructor verwacht
//		Print van dier de kenmerken uit met de methode kenmerken(). Dit dier is niet tam.
		
//		Initieer nu een newDier() object als Dier met een zelfgekozen naam. Vergeet niet 2 argumenten mee te geven die de Dier constructor verwacht
//      Print van dit dier de beschikbare kenmerken uit met de methode kenmerken()
//      Waarom heeft dit object geen beschikking over de Vogel variabelen?
		 Dier dier = new Vogel(true, "duif", "Tortelduif", "mais");
	     System.out.println(dier.kenmerken());	       
	       
	     Vogel diera = new Vogel(false, "killer bird", "musje", "friet");
	     System.out.println(diera.kenmerken());
	     
	     Dier dierb = new Dier("Loekie de Leeuw", "chips");
	     System.out.println(dierb.kenmerken());
	        
	     System.out.println("het aantal aangemaakte dieren = " + dier.geefAantal());
	     
	   

	}

}
