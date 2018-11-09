import static java.lang.System.*;
import java.util.*;

public class compartTo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(in);

		out.print("Comparing 'axe' with 'dog' produces ");
		int i = "axe".compareTo("dog");
		out.println(i);

		out.print("Comparing 'fun' with 'suck' produces " );
		i = "fun".compareTo("suck");
		out.println(i);

		out.print("Comparing 'go' with 'stop' produces " );
		i = "go".compareTo("stop");
		out.println(i);

		out.print("Comparing 'run' with 'walk' produces " );
		i = "run".compareTo("walk");
		out.println(i);

		out.print("Comparing 'drive' with 'ride' produces " );
		i = "drive".compareTo("ride");
		out.println(i);

		out.print("Comparing 'slap' with 'punch' produces " );
		i = "slap".compareTo("punch");
		out.println(i);

		out.print("Comparing 'suck' with 'blow' produces " );
		i = "suck".compareTo("blow");
		out.println(i);

		out.print("Comparing 'whisper' with 'scream' produces " );
		i = "whisper".compareTo("scream");
		out.println(i);

		out.print("Comparing 'love' with 'hate' produces " );
		i = "love".compareTo("hate");
		out.println(i);

		out.print("Comparing 'some' with 'none' produces " );
		i = "some".compareTo("none");
		out.println(i);

		out.print("Comparing 'car' with 'arc' produces " );
		i = "car".compareTo("car");
		out.println(i);

		out.print("Comparing 'cat' with 'dog' produces " );
		i = "cat".compareTo("cat");
		out.println(i);

		out.print("Type a word: ");
		String test = kb.nextLine();
		i = test.compareTo("cat");
		if(i == 0) {
			out.println("Success");
		}
		else {
			out.println("Failure");
		}
	}
}