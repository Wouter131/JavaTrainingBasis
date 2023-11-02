package basisOefeningen;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i,lengteReeks=10;
		 System.out.print(n1+" "+n2); //print 0 en 1 op het scherm   
		    
		 for(i=2;i<lengteReeks;++i)  //loop start vanaf 2 omdat 0 en 1 al zijn uitgeprint   
		 {    
		  n3=n1+n2;
		  //Voeg code toe die de reeks van Fibonacci uitprint door de waarde van n1 en n2 aan te passen:
		  //n1 moet de waarde van n2 krijgen
		  //n2 moet de waarde van n3 krijgen

		 
//		  -Extra: Ik ben bang voor het ongeluksgetal 13, deze wil ik niet zien! Maar wel de rest.
//		  Zorg dat het uitprinten van n3 de laatste regel van de for loop is
//		  Plaats daarboven een if statement. Als n3 gelijk is aan 13 voer dan de volgende regel uit:
//		  continue;
//		  -Verwachte output als lengteReeks=10;
//		  0 1 1 2 3 5 8 21 34
//		  -Extra 2 Verander de continue; in break;
//		  -Verwachte output als lengteReeks=10;
//		  0 1 1 2 3 5 8

		  System.out.print(" "+n3);
	}

}
}
