public class reverseString {

	public static void main(String[] args) {
		System.out.println("Reverse String:\n");
		// Reverse String
		String reversed = "!dekcirT neeb evah uoY !aH";
		reverseStringMethod(reversed); // Calls and Inherits data from String
										// "Reversed" above and uses it within
										// the
										// reverseString method.
	}

	private static void reverseStringMethod(String b) { // Sub Method called in
														// the main method with
														// inherited B string.
		String c = new StringBuilder(b).reverse().toString(); // New String Var
																// C is String B
																// in reverse.
		System.out.println(c); // Prints out String C.
	}
}
