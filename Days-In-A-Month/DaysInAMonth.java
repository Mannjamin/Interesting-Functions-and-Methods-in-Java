package randomcode;

public class DaysInAMonth {

	public static void main(String[] args) {
		System.out.println("Days in a month:\n");
		String month = "Febuary"; // Declared month as String
		int year = 2005;
		isLeapYear(year);

		DaysInMonth(year, month); // Calls DaysInMonth sub method and inherits
									// Year and Month from the Main method.
	}

	private static void DaysInMonth(int a, String b) // Sub Method, inherits A
														// and B from main
														// method.
	{
		int days; // Depending on String Value B (Month), the switch case below
					// displays the number of days.
		switch (b) {
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			days = 31;
			break;

		case "Febuary":
			days = 28;

			if (a % 4 == 0) {
				if (a % 100 == 0) {
					if (a % 400 == 0) {
						days = 29;
						break;
					} else {
						days = 28;
						break;
					}
				} else {
					days = 29;
					break;
				}
			}

		case "April":
		case "June":
		case "September":
		case "November":
			days = 30;
			break;

		default:
			days = -1;
			break;
		}
		System.out.println("There are " + days + " in " + b); // Outputs the
																// Month and
																// days based on
																// the switch
																// statement
																// above.

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
					System.out.println(a + " is a leap year");
				} else {
					System.out.println(a + " is not leap year");
				}
			} else {
				System.out.println(a + " is a leap year");
			}
		} else {
			System.out.println(a + " is not leap year");
		}
	}

}
