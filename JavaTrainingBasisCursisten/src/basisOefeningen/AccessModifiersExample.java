package basisOefeningen;

 public class AccessModifiersExample {

    public String naam= "Wouter";
    protected String achterNaam = "van Praag";
    String woonplaats = "Zaltbommel"; //geen modifier betekent 'Default access' of 'Package access'
    private String schuilkelder= "Ja, is aanwezig";

    public String getNaam(){
        return this.naam;
    }

    public AccessModifiersExample(){

    }

     public static void main(String[] args) {
         AccessModifiersExample a = new AccessModifiersExample();



     }

}
