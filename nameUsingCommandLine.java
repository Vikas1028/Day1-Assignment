import java.util.Scanner;

public class nameUsingCommandLine {

	public static void main(String[] args) {
		
		String name;
		
		Scanner Name=new Scanner(System.in);
		System.out.print("Enetr any name : ");
		name=Name.next();
		System.out.println("Your name is "+ name);
		Name.close();
	}
}
