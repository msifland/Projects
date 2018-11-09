import static java.lang.System.*;
import java.util.*;

public class ThreeCups {

	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(in);

		int guess = 0;
		int ace = 0;

		out.print("\nYou step up to the table and the dealer greets you.\nHe flips over 2 Jacks and an Ace. He then flips them face down and\nstart shuffling them around quickly. After about one minute of\nshuffling he says \"Guess which one is the Ace\". You tried to\nwatch closely and make your best guess...\n\n\t\t##  ##  ##\n\t\t1   2   3\n\n>>> ");

		ace = 1 + (int)(3 * Math.random());
		guess = kb.nextInt();

		if(guess == ace) {
			out.println("Man your good, you got it!");
			if(ace == 1) {
				out.println("\n\t\tAA  ##  ##\n\t\t1   2   3");
			}
			else if(ace == 2) {
				out.println("\n\t\t##  AA  ##\n\t\t1   2   3");
			}
			else if(ace == 3) {
				out.println("\n\t\t##  ##  AA\n\t\t1   2   3");
			}
		}
		else {
			out.println("Nope, you are wrong.");
			if(ace == 1) {
				out.println("\n\t\tAA  ##  ##\n\t\t1   2   3");
			}
			else if(ace == 2) {
				out.println("\n\t\t##  AA  ##\n\t\t1   2   3");
			}
			else if(ace == 3) {
				out.println("\n\t\t##  ##  AA\n\t\t1   2   3");
			}
		}
	}
}
