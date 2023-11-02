package basisOefeningen;

public class test {
    public static void main(String[] args) {

     int a = 10; System.out.println("a heeft waarde: " + a);
     int b = 10; System.out.println("b heeft waarde: " + b++);
                 System.out.println("b heeft waarde: " + b);
     int c = 10; System.out.println("c heeft waarde: " + ++c);
     int d = 10; System.out.println("d heeft waarde: " + d--);
                 System.out.println("d heeft waarde: " + d);
     int e = 10; System.out.println("e heeft waarde: " + --e);
     int samen = a + b + c + d + e;
                 System.out.println("\nsamen heeft waarde: " + samen);

     int modulo1 = samen % 4;
                 System.out.println("modulo1 heeft waarde: " + modulo1);
     int f = 10; System.out.println("f heeft waarde: " + f);
     f += 5;     System.out.println("f heeft waarde: " + f);
     f -= 5;     System.out.println("f heeft waarde: " + f);
     f /= 5;     System.out.println("f heeft waarde: " + f);
     f *= 5;     System.out.println("f heeft waarde: " + f);


     int i1 = 10;
     int i2 = 20;
     System.out.println(i1 >= i2);
     long long1 = 1000000000;
     long long2 = 1000000001;
     System.out.println(long1 >= long2);













    }

}
