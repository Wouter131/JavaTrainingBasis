package sandboxBasisOefeningen;

import java.util.ArrayList;

public class CreateArrayList {

    public static void main(String[] args) {

        //Array
        String naamArray[] = new String [3];
        naamArray[0] = "Wouter";
        naamArray[1] = "Astrid";
        //ArrayList
        ArrayList<String> naamArrayList = new ArrayList<>();
        naamArrayList.add("Wouter");
        naamArrayList.add("Astrid");


        System.out.println(naamArrayList.get(1));


    }
}
