import static java.lang.System.*;
import java.util.*;

public class CollatzSequ {

	public static void main(String[] args) {
		Scanner kb = new Scanner(in);

		double n = 0;
		double largest = 0;
		int o = 0;


		out.print("Enter a number: ");
		n = kb.nextDouble();

			while(n > 1) {
			if((n % 2) == 0) {
				n = (n / 2);
				out.println(String.format("%.2f", n));
			}
			else {
				n = ((n * 3) + 1);
				out.println(String.format("%.2f", n));
			}
			o++;
			if(n > largest) {
				largest = n;
			}
		}
		out.println("Terminated after " + o + " steps.");
		out.println("The largest value was " + (String.format("%.2f", largest)));
	}
}