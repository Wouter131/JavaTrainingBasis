package sandboxBasisOefeningen;

public class Builder {

	public static void main(String[] args) {
		
		
		StringBuilder sb1 = new StringBuilder("Salves, zeker weten!");
		
		System.out.println(sb1.charAt(3));
		System.out.println(sb1.indexOf(","));
		System.out.println((sb1.substring(14, 19)));
		
		boolean b = true;
		double  d = 15.82;
		int     i = 444;
		char    c = 'Y';
		sb1.append(b).append(d).append(i).append(c);
		System.out.println(sb1);
		sb1.delete(20, 33);
		System.out.println(sb1);
		sb1.insert(7, " dat is pas");
		System.out.println(sb1);
		sb1.delete(7, 18);
		System.out.println(sb1);
		System.out.println(sb1.length());
		sb1.subSequence(1, 5);
		StringBuilder sb2 = new StringBuilder(sb1.subSequence(0, 6));
		System.out.println(sb2);
		

	}

}
