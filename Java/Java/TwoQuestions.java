import static java.lang.System.*;
import java.util.*;

public class TwoQuestions {
	public static void main(String[] args) {
		Scanner kb = new Scanner(in);

		String guess, ans1, ans2;

		out.println("\nTHIS IS THE GAME 2 QUESTIONS.\n\nThink of an object, and I'll try to guess it.\n\n");
		out.print("Question 1) Is it an animal, vegetable, or mineral?\n> ");
		ans1 = kb.nextLine();

		out.print("Question 2) Is it bigger than a breadbox?\n> ");
		ans2 = kb.nextLine();

		if(ans1.length() > 0) {
		if(ans1.equals("animal")) {
			if(ans2.equals("yes")) {
				guess = "moose";
			}
			else {
				guess = "squirrel";
			}
		}
		else if(ans1.equals("vegetable")) {
			if(ans2.equals("yes")) {
				guess = "watermelon";
			}
			else {
				guess = "carrot";
			}
		}
		else if(ans1.equals("mineral")) {
			if(ans2.equals("yes")) {
				guess = "Camero";
			}
			else {
				guess = "paper clip";
			}
		}
		else {
			out.println("I did not understand");
			guess = "";
		}

		out.println("\nMy guess is that you are thinking of a " + guess);
		out.println("I would wask if I'm right, but I don't actually care...");
		}
		else {
			out.println("You did not enter anything...");
		}
	}
}