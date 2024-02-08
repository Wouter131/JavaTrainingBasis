package basisOefeningenUitwerkingen;

import java.util.*;

public class ModulesUitrekenenZonderModulesOperator {

	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
	        System.out.print("Geeft het eerste nummer op : ");
	        int a = in.nextInt();  
			System.out.print("Geef het tweede nummer op : ");
			int b = in.nextInt(); 
			int gedeeld = a / b;
			System.out.println(gedeeld);
			System.out.println(gedeeld * b);
			int resultaat = a - (gedeeld * b);
			System.out.println(resultaat); 			

	}

}
