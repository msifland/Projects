import static java.lang.System.*;
import java.util.Scanner;
public class PhraseRepeaterDriver {
	public static void main( String[] args ) {
		Scanner kb = new Scanner(System.in);

		out.print("Enter a message: ");
		String msg = kb.nextLine();
		out.print("Number of times to repeat: ");
		int n = kb.nextInt();

		PhraseRepeater pr = new PhraseRepeater();
		pr.setValues(msg, n);

		out.println( pr.getRepeatedPhrase() );
	}
}