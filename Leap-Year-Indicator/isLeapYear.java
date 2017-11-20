public class LeapYearIndicator {

	public static void main(String[] args) {
		System.out.println("\n8.4.3 - Leap Year:\n");
		int year = 1886; // Declared Int
		isLeapYear(year); // Calls and Inherits year within the isLeapYear
							// method.
	}

	private static void isLeapYear(int a) { // Sub Method called within Main
											// with inherited year integer.
		if (a % 4 == 0) // Leap years take place every 4 years.
		{
			if (a % 100 == 0) // If the year mod 4 is 0, the code then checks
								// the year based on century.
			{
				if (a % 400 == 0) // If positive, the code finally check if the
									// year is the same every 400 years. if this
									// is true. The year is a leap yer.
				{
					System.out.println(a + " Is a leap year");
				} else {
					System.out.println(a + " Is not leap year");
				}
			} else {
				System.out.println(a + " Is a leap year");
			}
		} else {
			System.out.println(a + " Is not leap year");
		}
	}

}
