package basisOefeningen;

public class Rekenkundig {

	public static void main(String[] args) {		
		
		int a = 10;	                   System.out.println("a heeft waarde: " + a);		
		int b = 10;                    System.out.println("b heeft waarde: " + b++);
		                               System.out.println("nog een keer b uitprinten: " + b);
		int c = 10;                    System.out.println("c heeft waarde: " + ++c);
		int d = 10;                    System.out.println("d heeft waarde: " + d--);
		                               System.out.println("nog een keer d uitprinten: " + d);
		int e = 10;                    System.out.println("e heeft waarde: " + --e);
		int samen = a + b + c + d + e; System.out.println("samen is: " + samen);		
		int modulo1 = samen % 4;       System.out.println("modulo1 is: " + modulo1);		
		int f = 10;                    System.out.println("f heeft waarde: " + f);
		f += 5;                        System.out.println("f heeft na +=5 de waarde: " + f);
		f -= 5;                        System.out.println("f heeft na -=5 de waarde: " + f);
		f /= 5;                        System.out.println("f heeft na /=5 de waarde: " + f);
		f *= 5;                        System.out.println("f heeft na *=  de waarde: " + f);
		

	}

}
