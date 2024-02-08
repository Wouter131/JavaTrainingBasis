package basisOefeningenUitwerkingen;

public class DayOfTheWeekSwitch {

	public static void main(String[] args) {
		int nummerDag = 6;
		String naamDag;
		
		//In de String "naamDag" moet de juiste naam van de week weggeschreven worden op basis van int nummerDag.
		//Als nummerDag 1 is moet naamdag de waarde "Maandag" krijgen, bij 2 "Dinsdag" etc.
		//Als geen juiste dag is opgegeven krijgt nummerDag de default waarde: "Dit is geen dag"
		//Doe bovenstaande met behulp van een switch statement
		//Print na het switchstatement nummerDag uit
		//test je switchstatement voor de dagen 1 tm 8
		
		 switch (nummerDag) {
			 case 1:
	        	naamDag = "Maandag"; 
	            break;
	        case 2: 
	        	naamDag = "Dinsdag"; 
	            break;
	        case 3: 
	        	naamDag = "Woensdag"; 
	            break; 
	        case 4: 
	        	naamDag = "Donderdag"; 
	            break; 
	        case 5: 
	        	naamDag = "Vrijdag"; 
	            break; 
	        case 6: 
	        	naamDag = "Zaterdag"; 
	            break; 
	        case 7: 
	        	naamDag = "Zondag"; 
	            break; 
	        default: 
	        	naamDag = "Dit is geen dag"; 
	            break; 
	        } 
	        System.out.println(naamDag);
	        
			//Pas je switchstatement aan, bij waarde 6 en 7 moet de String naamDag "weekend" worden
			//Voeg bij 6 en 7 een print toe met "Yes! Het is weekend. 
			//Geef nummerDag de waarde 6 en run de applicatie
			//Haal nu de break bij 6 weg. Wat is het verschil?
	        
	      
	        
	        switch (nummerDag) { 
	        case 1: 
	        	naamDag = "Maandag"; 
	            break; 
	        case 2: 
	        	naamDag = "Dinsdag"; 
	            break; 
	        case 3: 
	        	naamDag = "Woensdag"; 
	            break; 
	        case 4: 
	        	naamDag = "Donderdag"; 
	            break; 
	        case 5: 
	        	naamDag = "Vrijdag"; 
	            break; 
	        case 6: 
//	        	naamDag = "Weekend"; 
//	        	System.out.println("Yes! Het is weekend!");
//	            break;
	        case 7: 
	        	naamDag = "Weekend"; 
	        	System.out.println("Yes! Het is weekend!");
	            break; 
	        default: 
	        	naamDag = "Dit is geen dag"; 
	            break; 
	        } 
	        System.out.println(naamDag);

	}

}
