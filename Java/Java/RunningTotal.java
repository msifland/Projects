import static java.lang.System.*;
import java.util.*;
public class RunningTotal {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int current, total = 0;

		out.print("Type in a bunch of values and I'll add them up: ");
		out.print("I'll stop when you type a 0. ");
		out.print("\n\tValue>>> ");
		current = keys.nextInt();
		total += current;

		while (current != 0) {
			out.print("The total so far is: "+total+" ");
			out.print("\n\tValue>>> ");
			current = keys.nextInt();
			total = total + current; // or total += current
			if (current!=0) {

			}
		}

		/*
		do {
			out.print("\n\tValue>>> ");
			current = keys.nextInt();
			total = total + current; // or total += current
			if (current!=0) {
				out.print("The total so far is: "+total+" ");
			}
		} while (current != 0);
*/
		out.println("\n\tThe final total is: "+total);

	}
}
