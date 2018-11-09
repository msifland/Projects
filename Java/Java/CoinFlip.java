import static java.lang.System.*;
import java.util.*;

public class CoinFlip {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String coin, again;
		int streak = 0;
		boolean gotHeads;
		do {
			gotHeads = Math.random() < 0.5;

			if (gotHeads) {
				coin = "HEADS";
			}
			else {
				coin = "TAILS";
			}

			out.println("You flip a coin and it is... "+coin);

			if (gotHeads) {
				streak++;
				out.println("\tThat's "+streak+" in a row...");
				out.print("\tWould you like to flip again[y/n]? ");
				again=keys.nextLine();
			}
			else {
				out.println("\tYou lose everything!!!");
				out.println("\tShould've quit while you were aHEAD...");
				streak=0;
				again="n";
			}
		} while (again.equals("y"))

		out.println("Final Score: "+streak);
	}
}
