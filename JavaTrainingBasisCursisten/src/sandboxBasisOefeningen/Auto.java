package sandboxBasisOefeningen;

import java.util.ArrayList;

public class Auto {
	  String type;
	  int motorVermogen;
	  double afstand;
	  int versnelling = 0;
	  
	  //Overloaded constructors: dezelfde constructor naam, maar met verschillende argumenten
	  
	  public Auto() {
		  System.out.println("Groeten van de no-argument constructor");
	  }

	  public Auto(String t) {
		  this();
		  System.out.println("Groeten uit de 1 argument constructor");
	      this.type = t;
	      this.afstand = 13.13;
	      this.motorVermogen = 40;
	  }

	  public Auto(String s, double d ) {
		  this(s);
//		  System.out.println("Groeten uit de 2 argument constructor");
	      this.afstand = d;
	      this.motorVermogen = 40;
	  }

	  public Auto(String s, double d, int i ) {
		  this(s, d);
//		  System.out.println("Groeten uit de 2 argument constructor");

	      this.motorVermogen = i;
	  }




	public static void main(String[] args) {

		
		
		
		
		
		
		
	  
        
        


	
		
		
		
		
		

	}

}
