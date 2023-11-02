package salves;

public class Auto {
	  String type;
	  double afstand;
	  int motorVermogen;
	  int versnelling = 0;

	  public Auto() {
		  this.afstand = 13.13;
		  this.motorVermogen = 40;
	  }

	  public Auto(String t) {
		  this.type = t;
	      this.afstand = 13.13;
	      this.motorVermogen = 40;
	  }

	public Auto(int vers, String tijdelijk) {
		this.versnelling = vers;
		this.type = tijdelijk;
		this.afstand = 77777.77;
		this.motorVermogen = 370;

	}

	public static void main(String[] args) {
		Auto autoA = new Auto("Ferrari");
		Auto autoB = new Auto();
		Auto autoC = new Auto(6,"BMW");

		System.out.println(autoC.type);
		System.out.println(autoC.afstand);
		System.out.println(autoC.motorVermogen);
		System.out.println(autoC.versnelling);

	}
}
