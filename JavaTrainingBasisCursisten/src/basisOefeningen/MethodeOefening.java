package basisOefeningen;

public class MethodeOefening {

    int getalletje = 40;

    //constructor - hoeft niets mee te gebeuren
    MethodeOefening(){}

    // void methode 0 argumenten
    public void verdubbel(){
        // code om getalletje te verdubbelen, dat kan met: this.getalletje *= 2;
    }

    // void methode 1 argument
    public void plusGetal(int temp){
        // code om het meegegeven getal bij getalletje te tellen
    }

    // void methode 2 argumenten
    public void VermenigvuldigTweeKeer(int temp1, int temp2){
        // code om het eerste meegegeven getal te vermenigvuldigen met getalletje en de uitkomst moet de nieuwe waarde van getalletje worden
        // code om hetzelfde te doen met het tweede meegegeven getal
    }

    // maak hier een extra methode aan die de waarde van getalletje terug geeft

    public static void main(String[] args) {
        MethodeOefening m = new MethodeOefening();
        //roep getGetalletje aan voor object m met: m.Getalletje() in een System.out.println
        m.verdubbel();
        //roep getGetalletje aan voor object m met: m.Getalletje() in een System.out.println
        m.plusGetal(50);
        //roep getGetalletje aan voor object m met: m.Getalletje() in een System.out.println
        m.VermenigvuldigTweeKeer(2, 3);
        //roep getGetalletje aan voor object m met: m.Getalletje() in een System.out.println


    }







}
