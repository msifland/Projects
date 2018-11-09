import static java.lang.System.*;
import java.util.*;

public class Randomness {

	public static void main(String[] args) {

		Random r = new Random(7856);

		int x = 1 + r.nextInt(10);

		out.println("My random number is " + x);

		out.println("Here are some numbers from 1 to 5");
		out.print(1 + r.nextInt(5) + " ");
		out.print(1 + r.nextInt(5) + " ");
		out.print(1 + r.nextInt(5) + " ");
		out.print(1 + r.nextInt(5) + " ");
		out.print(1 + r.nextInt(5) + " ");
		out.print(1 + r.nextInt(5) + " ");
		out.println();

		out.println("Here are some numbers from 1 to 100");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.print(1 + r.nextInt(100) + " ");
		out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
		out.println("Random numbers chosen were " + num1 + " and " + num2);
		if(num1 == num2) {
			out.println("The random numbers were the saem. Wierd!!!");
		}
		if(num1 != num2) {
			out.println("The random numbers were different. Not to surprising");
		}
	}
}