import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;
public class CoinFlipSaved {
	public static void main(String [] args) throws Exception {
		Scanner keys = new Scanner(System.in);
		String coin, again, bestName, saveFileName = "coin_flip_score.txt";
		int streak = 0, best;
		boolean gotHeads;

		File f = new File(saveFileName);
		if (f.exists() && f.length() > 0) {
			Scanner input = new Scanner(f);
				bestName = input.nextLine();
				best = input.nextInt();
			input.close();
			out.print("High score is " + best);
			out.println(" flips in a row by " + bestName);
			out.println();
			mySleep.sleep(500);
		}
		else {
			out.println("Save game file does not exist or is empty.");
			bestName = "none";
			best = 1;
		}

		do {
			gotHeads = Math.random() < 0.5;

			if (gotHeads) {
				coin = "HEADS";
			}
			else {
				coin = "TAILS";
			}

			out.println("\nYou flipped a coin and it's " + coin);

			if (gotHeads) {
				streak++;
				out.println("\tThat's " + streak + " in a row...");
				out.print("\tWould you like to flip again?[y/n] ");
				again = keys.nextLine();
			}
			else {
				streak = 0;
				again = "n";
			}
		} while (again.equals("y"));

		out.println("Final score: " + streak);

		if (streak > best) {
			out.println("That's a new high score!!!");
			out.print("Your name: ");
			bestName = keys.nextLine();
			best = streak;
		}
		else if (streak == best) {
			out.println("That ties teh high score. Good job but not enough to get your name on the books.");
		}
		else {
			out.print("You'll have to do better than ");
			out.println(streak + " if you want a high score.");
		}

		// Save the name and high score to the file
		PrintWriter write = new PrintWriter(f);
			write.println(bestName);
			write.println(best);
		write.close();
	}
}