package sandboxBasisOefeningen;

public class Person {
	private String naam;

	public Person(String name){
		this.naam = name;
	}

	public String getName() {
		return this.naam;
	}

	public void setNaam(String nieuweNaam){
		this.naam = nieuweNaam;
	}

	public static void main(String[] args) {
		Person cursist1 = new Person("Piet");
		System.out.println(cursist1.getName());
		cursist1.setNaam("Alex");
		System.out.println(cursist1.getName());

	}
}
