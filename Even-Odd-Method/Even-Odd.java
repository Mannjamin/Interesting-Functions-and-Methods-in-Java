public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("8.4.1 - Even / Odd:\n");
		// Oods and Even Numbers
		int i; // Declare Integer
		boolean eo; // Declare Boolean for true and false
		String s = ""; // String Value declaration for return.
		
		for (i = 1; i <= 25; ++i) // I equals 1. While I i less than or equal to
									// 25, keep adding 1 with each loop.
		{
			eo = EvenOddMethod(i); // Declares eo as a boolean integer, inherits
									// boolean value of I.
			s = (eo) ? "Even" : "Odd"; // True is even, False is odd.
			System.out.println(i + " is " + s); // Print value.
		}
	}

	public static boolean EvenOddMethod(int a) { // Method linked to Odd Even
													// functions above.
		if (a % 2 == 0) // if even
		{
			return true; // return true
		} else // if false
		{
			return false; // return false
		}
	}

}
