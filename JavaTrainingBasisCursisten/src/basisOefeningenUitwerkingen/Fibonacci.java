package basisOefeningenUitwerkingen;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i,lengteReeks=20;
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<lengteReeks;++i)   
		 { 			 
		  n3=n1+n2; 
		//Voeg code toe die de reeks van Fibonacci uitprint
		  n1=n2;    
		  n2=n3;

//		  Extra: Ik ben bang voor het ongeluksgetal 13, deze wil ik niet zien!
		  if (n3 == 13) {
			  continue;
		  }

		  System.out.print(" "+n3);	
	}
		 
		 
		 
		 System.out.println(" doei");

}
}
