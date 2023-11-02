package sandboxBasisOefeningen;

public class CastingPrimitiveDataTypes {

	public static void main(String[] args) {
//		Widening Casting (automatically) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
//
//		Narrowing Casting (manually) - converting a larger type to a smaller size type
//		double -> float -> long -> int -> char -> short -> byte
		
		//Voorbeeld Widening Casting (gebeurt automatisch):
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
//	    Narrow casting moet handmatig door het type tussen () te zetten.
	    double myDouble2 = 9.78;
	    int myInt2 = (int) myDouble2; // Manual casting: double to int

	    System.out.println(myDouble2);   // Outputs 9.78
	    System.out.println(myInt2);      // Outputs 9
		
	    
	    byte maxByte = 127;
		short maxShort = 32767;
		int nummer = 2147483647;
		long nummer2 = 9223372036854775807L;
		float getal = 7.12345679f;
		double getal2 = 7.12345678901234568;
		
		maxByte = (byte)getal2;
		System.out.println(maxByte);
		
		//Maak nu zelf gebruik van narrow casting en print uit		
		int nummer77 = (int)getal;
		System.out.println("nummer 77: " + nummer77);
		
		

	}

}
