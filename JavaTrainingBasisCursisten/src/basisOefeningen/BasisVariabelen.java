package basisOefeningen;

public class BasisVariabelen {

	public static void main(String[] args) {
		
		byte maxByte = 127;
		short maxShort = 32767;
		int nummer = 2147483647;
		long nummer2 = 9223372036854775807L;
		float getal = 7.12345679f;
		double getal2 = 7.12345678901234568;
		char letter = 'a';
		char unicode = '\u0070';
		boolean doorgaan = true;
		
		//TODO: uitleggen hoe je tekst + variabele uitprint in System.out
		System.out.println("hello world"  + maxByte);
		System.out.println(maxByte);
		System.out.println(maxShort);
		System.out.println(nummer);
		System.out.println(nummer2);
		System.out.println(getal);
		System.out.println(getal2);
		System.out.println(letter);
		System.out.println(unicode);
		System.out.println(doorgaan);
		
		//Maak nu zelf van elk primitief data type een variabele aan en ken er een waarde aan toe
		//Maak ook eens een zo onleesbaar mogelijk variabele aan. Denk aan de volgende regels voor een variabele:
		
		//Underscore en currency signs overal toegestaan
		//Overige speciale tekens niet toegestaan
		//Mag niet starten met digit (0-9)
		
		//Wat gebeurt er als de opgegeven waarde niet legaal is voor het datatype? Maar je probeert het toch uit te printen?
		//Denk aan: komma getal in byte, short, int, long. Overschrijden max value van datatype etc.
		
		//Kun je een variabele naam gebruiken van een java key word? (for, new, public, do, while, goto)


	}

}
