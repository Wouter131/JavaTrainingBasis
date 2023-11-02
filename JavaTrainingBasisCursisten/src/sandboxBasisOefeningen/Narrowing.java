package sandboxBasisOefeningen;

public class Narrowing {

	public static void main(String[] args) {
//		Narrowing Casting (manually) - converting a larger type to a smaller size type
//		double -> float -> long -> int -> char -> short -> byte
		
		
		int leeftijd1, leeftijd2, leeftijd3;
		leeftijd1 = 3;
		leeftijd2 = 2;
		leeftijd3 = 5;
		
		int gemiddelde = (leeftijd1 + leeftijd2 + leeftijd3) / 3;
		System.out.println(gemiddelde);
		
		float gem = gemiddelde;
		System.out.println(gem);
		
		float gemiddeldeFloat = (leeftijd1 + leeftijd2 + leeftijd3) / 3;
		System.out.println(gemiddeldeFloat);
		
		float narrowingGemiddelde = (float)(leeftijd1 + leeftijd2 + leeftijd3) / 3;
		System.out.println(narrowingGemiddelde);
		
		//andersom
		
		float age1, age2, age3;
		age1 = 2.5f;
		age2 = 4.5f;
		age3 = 3.0f;
		
		float ave = (age1 + age2 + age3) / 3.0f;
		System.out.println(ave);
		
		int aveInt = (int)ave;
		System.out.println(aveInt);
		

	}

}
