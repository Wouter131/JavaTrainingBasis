package basisOefeningenUitwerkingen;

public class StringBuilderOpdracht {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder ("hoi allemaal");
		System.out.println(s.substring(2, 5));
		System.out.println(s.reverse());
		
		StringBuilder s2 = new StringBuilder("ja");
		s = s2;
		
		String s5 = "hoi";
		s5 = "hallo";
		
		String sss = "Salves";
		System.out.println(sss.substring(0,6));

		StringBuilder voorbeeld = new StringBuilder(("hallo!"));
		System.out.println(voorbeeld.substring(3, 5) + 'l');

	}

}
