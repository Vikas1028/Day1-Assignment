import java.util.Scanner;

public class LeapYear {

	// user input
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number- ");
		a = sc.nextInt();
		// condition
		if (a % 4 == 0 && a >= 1582) {
			System.out.println(a + " is a Leap Year");
		} else if (a < 1582) {
			System.out.println(
					"The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.");
		} else {
			System.out.println(a + " is not a Leap Year");
		}

	}
}
