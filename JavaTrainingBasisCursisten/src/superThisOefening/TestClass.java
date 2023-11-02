package superThisOefening;

public class TestClass {

    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Toyota", 4);

        System.out.println("Auto start:");
        mijnAuto.start();

        System.out.println("\nAuto details:");
        mijnAuto.toonDetails();

        System.out.println("\nRoep superklasse start-methode op vanuit subklasse:");
        mijnAuto.startSuper();
    }
}
