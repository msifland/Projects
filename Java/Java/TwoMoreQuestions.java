import static java.lang.System.*;
import java.util.*;

public class TwoMoreQuestions {

	public static void main(String[] args) {
		Scanner kb = new Scanner(in);

		String guess = "", ans1, ans2;

		out.println("\nTHIS IS THE GAME 2 QUESTIONS.\n\nThink of an object, and I'll try to guess it.\n\n");
		out.print("Question 1) Is it an animal, vegetable, or mineral?\n> ");
		ans1 = kb.nextLine();

		out.print("Question 2) Is it bigger than a breadbox?\n> ");
		ans2 = kb.nextLine();

		if(ans1.equals("animal") && ans2.equals("yes")) {
			guess = "moose";
		}
		if(ans1.equals("animal") && ans2.equals("no")) {
			guess = "sqirrel";
		}
		if(ans1.equals("vegetable") && ans2.equals("yes")) {
			guess = "watermelo";
		}
		if(ans1.equals("vegetable") && ans2.equals("no")) {
			guess = "corn cob";
		}
		if(ans1.equals("mineral") && ans2.equals("yes")) {
			guess = "Corvette";
		}
		if(ans1.equals("mineral") && ans2.equals("no")) {
			guess = "piece of copper";
		}
		out.println("You are thinking of a " + guess);
	}
}