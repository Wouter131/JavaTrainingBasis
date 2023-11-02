package basisOefeningen;

public class StringBasics {

	public static void main(String[] args) {
		String a = "Salves";
		String a2 = "Salves";
		String b = "IBM";
		String c = "Philips";		
		String d = new String ("Salves");
		String d2 = new String ("Salves");
		String e = new String ("IBM");
		String f = new String ("Philips");
		
		//Print de volgende vergelijkingen uit:
		// a == b
		// a == d
		System.out.println(a == d);
		// a == a2
		// a equals a2
		System.out.println(a.equals(a2));
		// a equals b
		// a equals d
		// d equals d2
		// d == d2
		//Kun je de uitkomsten verklaren? Denk aan pool of Strings vs new	

		
		//Speel nu zelf met de String methodes, hieronder wat aantekeningen die je kunnen helpen
		//Maak ook eens een combo, van bijvoorbeeld een concat, replace en trim achter elkaar
		
//		Methodes van de class String
//
//		charAt() 
//		indexOf() 
//		substring()
//		trim()
//		replace()
//		length()
//		startsWith()
//		endsWith()
//
//		charAt() 
//		achterhalen karakter van opgegeven positie:
//		String letters "ABCDE" ;
//		System.out.println(letters.charAt(2));  <- C
//
//		indexOf() 
//		achterhalen positie van opgegeven karakter of opgegeven string, let op ' bij char en "bij string, indien niet gevonden dan krijg je -1 terug
//		String letters = "ABCDEB";
//		System.out.println('B'); <- 1
//		System.out.println("S"); <- -1
//		System.out.println("CD"); <- 2
//
//		Je kunt ook vanaf een bepaalde positie gaan zoeken:
//		System.out.println('B', 3)); <- 5
//
//		substring() 
//		2 smaakjes: het geeft de String terug vanaf de opgegeven positie tot het einde, of tot opgegeven positie -1
//		String exam = "Oracle";
//		String sub = exam.substring(2); 
//		System.out.println(sub); <- acle
//
//		String result = exam.substring(2, 4);
//		System.out.println(result) <- ac  (dus karakter 2 en 3, niet 4)
//
//		trim() 
//		Verwijderd de white spaces (new lines, spaties, tabs) voor en na de string, niet die in het midden staan
//
//		String letters = "  AB CDBB   ";
//		System.out.println(letters + ":");        <- |  AB CDBB   :
//		System.out.println(letters.trim() + ":"); <- |AB CDBB:
//
//		replace() Je vervangt in de string 1 char of 1 string, let dus op enkele of dubbele quotes, je mag die 2 niet mixen
//		String letters = "ABCAB";
//		System.out.println(letters.replace('B' , 'b')); <- AbCAb
//		System.out.println(letters.replace("CA", "12")); <- AB12B
//
//		Let op! letters blijft ABCAB
//
//		length()
//		Lengte van de string achterhalen, let op, aantal karakters wordt geteld, niet het aantal posities
//		System.out.println("Luuk".length()); <- 4
//
//		startsWith()
//		endsWith()
//		Je kunt controleren of de string eindigt met een bepaalde prefix, je kunt ook extra positie nummers meegeven.
//		Je krijg true of false terug
//
//		String letters = "ABCAB";
//		System.out.println(letters.startsWith("AB"));    <- true
//		System.out.println(letters.startsWith("a"));     <- false
//		System.out.println(letters.startsWith("A", 3));  <- true
//
//		System.out.println(letters.endsWith("CAB"));     <- true
//		System.out.println(letters.endsWith("B"));       <- true
//		System.out.println(letters.endsWith("b"));       <- false
		
		

	}

}
