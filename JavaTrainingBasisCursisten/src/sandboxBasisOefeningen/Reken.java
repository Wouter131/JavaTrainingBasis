package sandboxBasisOefeningen;

public class Reken {

    public static void main(String[] args) {


        int getal;
        getal = 40 + 30 - 10 * 5 / 2 ;
        ++getal;
        getal++;
        --getal;
        getal--;

        int antwoord = 13 % 4;

        System.out.println(getal);

        int voorbeeld = 10;
        voorbeeld += 20;
        // Is hetzelfde als:
        voorbeeld = voorbeeld + 20;



    }


}
