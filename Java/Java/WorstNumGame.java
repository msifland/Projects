import static java.lang.System.*;
import java.util.*;

public class WorstNumGame {

	public static void main(String[] args) {

		Scanner kb = new Scanner(in);

		int guess;
		int scrt = 1 + (int)(Math.random()*10);
		int i = 1;

		out.print("This is the worst number guessing game ever.\n\nI'm thingkin of a number form betwee 1 and 10. Try to guess it in 5 guesses: ");

		do {
		guess = kb.nextInt();
		if(guess == scrt) {
			out.println("You got it.");
			break;
		}
		else if(guess != scrt && i != 5) {

			out.println("You suck. Try again:");
			i++;
		}
		else {
			out.println("You suck. It was " + scrt);
			break;
		}
		} while(guess != scrt && i <= 5);
	}
}