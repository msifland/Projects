import static java.lang.System.*;
import java.util.*;
import java.lang.Thread.*;

public class RanNum {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(System.in);
		int nums = 0;
		int num;

		out.print("\033[2J");
		out.print("\u001b[H");
		sleep(500);
		out.println("\n\n\n*** This is a Random Number Generator based on your input. ***");

		out.print("\n\n\nFrom how many numbers would you like to generate? ");

		while (!kb.hasNextInt()) {
			sleep(500);
			out.print("You did not enter a number, please try again...");
			kb.next();
			sleep(500);
		}

		nums = kb.nextInt();
		num = 1 + (int)((nums) * Math.random());
		sleep(500);

		out.println("\n\nThe random number chosen between 1 and " + nums + " is: *****| " + num + " |*****\n");
		sleep(500);
	}

	public static void sleep( int slp) {
		try {
			Thread.sleep(slp);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}

