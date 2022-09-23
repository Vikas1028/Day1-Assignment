import java.util.Scanner;

public class sumOfCommandLineArguments {

	public static void main(String[] args) {

		Scanner Number = new Scanner(System.in);
		double Num1, Num2, Sum;
		System.out.print("Enetr First Number :");
		Num1 = Number.nextDouble();
		System.out.print("Enetr Second Number :");
		Num2 = Number.nextDouble();

		Sum = Num1 + Num2;
		System.out.println("The Sum of First and Second Number is " + Sum);
		Number.close();
	}
}
