package salves;

public class Testclass {

    public static void main(String[] args) {
        Tester wouter = new Tester(40,"Torenstraat 42", true);
        System.out.println(wouter.javaErvaring);//uit class Tester
        System.out.println(wouter.leeftijd);//uit class Personeel


        //sheet 101
        Personeel a = new Tester(40,"adres 1", false);
        Personeel b = new Personeel(41,"adres 2");
        Tester c = new Tester(43, "adres 3", true);

        System.out.println(a.boodschap());
        System.out.println(b.boodschap());
        System.out.println(c.boodschap());

        System.out.println(a.naamClass);
        System.out.println(b.naamClass);
        System.out.println(c.naamClass);
    }
}
