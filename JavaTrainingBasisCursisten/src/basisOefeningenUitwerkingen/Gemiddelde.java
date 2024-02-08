package basisOefeningenUitwerkingen;

public class Gemiddelde {

	public static void main(String[] args) {
		float cijfer1 = 7.6f;
		float cijfer2 = 5.6f;
		float cijfer3 = 8.8f;
		double gemiddelde = (cijfer1 + cijfer2) / 2;
		
		System.out.println("Gemiddelde van: " + cijfer1 + " en " + cijfer2 + " = " + gemiddelde);

		gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
		System.out.println("Gemiddelde van: " + cijfer1 + " en " + cijfer2 + " en " + cijfer3 + " = " + gemiddelde);
		
		//Uitdaging:Cijfer 1 telt voor 10%, cijfer2 voor 70%, cijfer3 voor 20%
        gemiddelde = (cijfer1 * 0.1) + (cijfer2 * 0.7) + (cijfer3 * 0.2);
        System.out.println(gemiddelde);
        
        //afronden
        gemiddelde = Math.round(gemiddelde * 100);
        gemiddelde = gemiddelde/100;
        System.out.println(gemiddelde); 
	}

}
