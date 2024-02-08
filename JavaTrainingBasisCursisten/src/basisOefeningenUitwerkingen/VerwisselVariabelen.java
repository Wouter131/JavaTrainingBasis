package basisOefeningenUitwerkingen;

public class VerwisselVariabelen {

	public static void main(String[] args) {
	
		
		   int a, b, temp;
		   a = 15;
		   b = 27;
		   System.out.println("Voor het verwisselen : a = " + a + " en b = " + b );
		   temp = b;
		   b = a;
		   a = temp;
		   System.out.println("Na het verwisselen : a = " + a + " en b = " + b );

	}

}
