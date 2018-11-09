import static java.lang.System.*;
import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		double x, y;
		String ready;
		out.print("Give me a number, and I'll find its square root. Are you ready?[y/Y]: ");
		ready = keys.nextLine();

		// Case insensitivity for this line, two options here:
		//while (!(ready.equals("y") || ready.equals("Y"))) {
		while (!ready.equalsIgnoreCase("y")) {
			out.print("You must type \"Y\" OR \"y\". Try again...ARE YOU READY?[y/Y]: ");
			ready = keys.nextLine();
		}

		out.print("Ok, now give me a number: ");
		x = keys.nextInt();
		while (x<0) {
			out.println("I won't take the square root of a negative number.");
			out.print("\nNew number: ");
			x = keys.nextDouble();
		}

		y = Math.sqrt(x);

		out.println("The square root of "+x+" is "+y);
	}
}
