package basisOefeningenUitwerkingen;

public class RelationeleOperators {

	public static void main(String[] args) {
		boolean bool = true;
		System.out.println("De waarde van bool is: " + bool);
		
		int a = 10;
		int b = 40;
		
		bool = a >= b;
		System.out.println("De waarde van bool is na a >= b :" + bool);
		
		bool = (a * 4) >= b;
		System.out.println("De waarde van bool is na (a * 4) >= b: " + bool);
		
		//Gebruik nu zelf de relationele oparatoren >, >= <, <=, ==, != tussen a en b. Schrijf de uitkomst weg in bool en print uit.
		bool = a > b; 	
		System.out.println("De waarde van bool is: " + bool);
		bool = a >= b; 	
		System.out.println("De waarde van bool is: " + bool);
		bool = a < b;	
		System.out.println("De waarde van bool is: " + bool);
		bool = a <= b;  
		System.out.println("De waarde van bool is: " + bool);
		bool = a == b;  
		System.out.println("De waarde van bool is: " + bool);
		bool = a != b;  
		System.out.println("De waarde van bool is: " + bool);

	}

}
