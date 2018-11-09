import static java.lang.System.*;
import java.util.*;
// Dice game
public class PigDice {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal;
		String choice = "";

		ptot = 0;
		ctot = 0;

		do {
			turnTotal = 0;
			out.println("You have " + ptot + " points.");

			do {
				roll = 1 + (int)(6*Math.random());
				out.println("\tYou rolled a " + roll + ".");
				if (roll == 1) {
					out.println("\tThat ends your trun.");
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					out.print("\tYou have " + turnTotal + " points so fart this round.\n");
					out.print("\tWould you like to \"roll\" again or \"hold\"? ");
					choice = keys.nextLine();
				}
			} while (roll != 1 && choice.equals("roll"));

			ptot += turnTotal;
			out.println("\tYou end the round with " + ptot + " points.");

			if (ptot < 100) {
				turnTotal = 0;
				out.println("Computer has " + ctot + " points.");
			}
			do {
				roll = 1 + (int)(6*Math.random());
				out.println("\tComputer rolled a " + roll + ".");
				if (roll == 1) {
					out.println("\tThat ends its turn.");
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					out.print("\tComputer has " + turnTotal + " points so far this round.\n");
					if (turnTotal < 20) {
					out.println("\tComputer will roll again.");
					}
				}
			} while (roll != 1 && turnTotal < 20);

			ctot += turnTotal;
			out.print("\tComputer ends the round with " + ctot + " points.\n");
		} while ( ptot < 100 && ctot < 100);

		if (ptot > ctot) {
			out.println("HUMANITY WINS!!!!");
		}
		else {
			out.println("GRRRRR!!! Machines win again....");
		}
	}
}
