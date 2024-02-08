package basisOefeningenUitwerkingen;

public class MethodeOefening {

    int getalletje = 40;

    //constructor - hoeft niets mee te gebeuren
    MethodeOefening(){}

    // void methode 0 argumenten
    public void verdubbel(){
        this.getalletje *= 2;
    }

    // void methode 1 argument
    public void plusGetal(int temp){
        this.getalletje += temp;
    }

    // void methode 2 argumenten
    public void vermenigvuldigTweeKeer(int temp1, int temp2){
        this.getalletje *= temp1;
        this.getalletje *= temp2;
    }

    public int getGetalletje(){
        return this.getalletje;
    }

    public static void main(String[] args) {
        MethodeOefening m = new MethodeOefening();
        System.out.println(m.getGetalletje());
        m.verdubbel();
        System.out.println(m.getGetalletje());
        m.plusGetal(50);
        System.out.println(m.getGetalletje());
        m.vermenigvuldigTweeKeer(2, 3);
        System.out.println(m.getGetalletje());


    }







}
