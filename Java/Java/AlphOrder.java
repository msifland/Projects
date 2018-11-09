import static java.lang.System.*;
import java.util.*;

public class AlphOrder {

	public static void main(String[] args) {

		Scanner kb = new Scanner(in);

		out.print("Please enter your name to see how long the wait is: ");
		String name = kb.nextLine();

		int c = name.compareTo("Carswell");
		int j = name.compareTo("Jones");
		int s = name.compareTo("Smith");
		int y = name.compareTo("Young");

		if(c <= 0) {
		 out.println("Your wait isn't very long. " + name);
		}
		else if(j <= 0) {
			out.println("That's not a bad wait. " + name);
		}
		else if(s <= 0) {
			out.println("Looks like a bit of a wait. " + name);
		}
		else if(y <= 0) {
			out.println("It's going to be a while. " + name);
		}
		else if(y > 0) {
			out.println("Not goind anywhere for a while. " + name);
		}
		out.println(c + " " + j + " " + " " + s + " " + y);
	}
}

