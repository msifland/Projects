import static java.lang.System.*;
import java.util.Scanner;
public class SquareRootDriver {
	public static void main( String[] args ) {
		Scanner kb = new Scanner(System.in);
		double n;

		SquareRootFinder sqrt = new SquareRootFinder();

		do {
			out.print("Enter a number (or <= 0 to quit); ");
			n = kb.nextDouble();

			if ( n > 0 ) {
				sqrt.setNumber(n);
				out.println( sqrt.getRoot() );
			}
		} while ( n > 0 );
	}
}