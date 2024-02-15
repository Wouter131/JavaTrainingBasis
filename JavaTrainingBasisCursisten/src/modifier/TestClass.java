package modifier;

import basisOefeningen.AccessModifiersExample;

public class TestClass {


    public static void main(String[] args) {
        AccessModifiersExample testAccessModifier = new AccessModifiersExample();

        //Wat gebeurt er als je alle variabelen in de class AccessModifiersExample op private zet, kun je ze nog aanroepen?
        //Antwoord = nee, private variablen zijn alleen binnen de class zelf aan te roepen

        //Kun je de public methode getNaam() nog aanroepen
        //Antwoord = ja, want die staat nog op public

        //Wat gebeurt er in de TestClass als de class AccessModifiersExample niet meer public is maar default (<geen>) modifier?
        //Antwoord = de class is niet meer zichtbaar omdat we in een ander package zitten
    }
}
