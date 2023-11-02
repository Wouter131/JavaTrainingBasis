package sandboxBasisOefeningen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Simpele class om data in te lezen
 * 
 * @author Taco
 *
 */
public class InleesUtil {
	/**
	 * Lees een integer in
	 * 
	 * @return
	 */
	public static int readInt() {
		return readInt("Geef een geheel getal in");
	}

	/**
	 * Lees een Integer in met de gegeven omschrijving als invoer vraag.
	 * 
	 * @param omschrijving
	 * @return
	 */
	public static int readInt(String omschrijving) {
		int data;
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.print(omschrijving + ": ");
		try {
			data = reader.nextInt(); // Scans the next token of the input as an int.
		} catch (InputMismatchException e) {
			throw e; // bij debuggen hier blijven hangen ipv unknown code
		}
		return data;
	}

	/**
	 * Lees een int in, bij fouten geef Integer.MIN_VALUE terug
	 * 
	 * @param omschrijving
	 * @return
	 */
	public static int readIntNoError(String omschrijving) {
		try {
			return readInt(omschrijving);
		} catch (InputMismatchException e) {
			return Integer.MIN_VALUE;
		}
	}

	/**
	 * Lees een double in
	 * 
	 * @return
	 */
	public static double readDouble() {
		return readDouble("Geef een komma getal in");
	}

	public static double readDouble(String omschrijving) {
		double data;
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.print(omschrijving + ": ");
		try {
			data = reader.nextDouble(); // Scans the next token
		} catch (InputMismatchException e) {
			throw e; // bij debuggen hier blijven hangen ipv unknown code
		}
		return data;
	}

	/**
	 * Lees een String in
	 * 
	 * @return
	 */
	public static String readString() {
		return readString("Geef een stuk tekst");
	}

	public static String readString(String omschrijving) {
		String data;
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.print(omschrijving + ": ");
		try {
			data = reader.nextLine(); // Scans the next token
		} catch (InputMismatchException e) {
			throw e; // bij debuggen hier blijven hangen ipv unknown code
		}
		return data;
	}

	/**
	 * Lees een string in, geef GEEN foutmelding als de invoer niet klopt, dan word er "" terug gegeven.
	 * 
	 * @param omschrijving
	 * @return
	 */
	public static String readStringNoError(String omschrijving) {
		try {
			return readString(omschrijving);
		} catch (InputMismatchException e) {
			// stilletjes negeren
			return "";
		}
	}
}
