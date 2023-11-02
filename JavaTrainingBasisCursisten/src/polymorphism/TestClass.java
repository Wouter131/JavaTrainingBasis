package polymorphism;

public class TestClass {

    public static void main(String[] args) {

        Dier mijnDierDier = new Dier();
        Hond mijnHondHond = new Hond();
        Kat mijnKatKat = new Kat();

        //De methode gedraagt zich anders op basis van het werkelijke subtype van het dier!!!
        Dier mijnDierHond = new Hond();
        Dier mijnDierKat = new Kat();

        //Aanroepen overridden methodes (zelfde naam + zelfde argumenten)
        mijnDierDier.geluidMaken();
        mijnHondHond.geluidMaken();
        mijnKatKat.geluidMaken();
        mijnDierHond.geluidMaken();
        mijnDierKat.geluidMaken();

        //Aanroepen overloaded methode in Hond (zelfde naam + verschillende argumenten. Er wordt een String verwacht in plaats van niets.
        mijnHondHond.geluidMaken("Woefffffffffffffffffffff");


    }



}
