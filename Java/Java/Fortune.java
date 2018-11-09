import static java.lang.System. *;
import java.util.*;

public class Fortune {

	public static void main(String[] args) {

		Scanner kb = new Scanner(in);

		Random r = new Random();

		int f = r.nextInt(6);
		String f1 = "You will win the lottery with these numbers";
		String f2 = "You will lose the lottery with these numbers";
		String f3 = "You will get rich soon";
		String f4 = "Your poorness will last forever";
		String f5 = "Don't take any wooden nickles";
		String f6 = "You will meet an old friend";

		int n1 = 1 + r.nextInt(52);
		int n2 = 1 + r.nextInt(52);
		int n3 = 1 + r.nextInt(52);
		int n4 = 1 + r.nextInt(52);
		int n5 = 1 + r.nextInt(52);
		int n6 = 1 + r.nextInt(52);

		out.println();
		if(f == 0) {
			out.print("Your fortune is \"" + f1 + "\"\nAnd your lucky numbers are " + n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
		}
		if(f == 1) {
			out.print("Your fortune is \"" + f2 + "\"\nAnd your UN-lucky numbers are " + n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
		}
		if(f == 2) {
			out.print("Your fortune is \"" + f3 + "\"\nAnd your lucky numbers are " + n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
		}
		if(f == 3) {
			out.print("Your fortune is \"" + f4 + "\"\nAnd your lucky numbers are " + n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
		}
		if(f == 4) {
			out.print("Your fortune is \"" + f5 + "\"\nAnd your lucky numbers are " + n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
		}
		if(f == 5) {
			out.print("Your fortune is \"" + f6 + "\"\nAnd your lucky numbers are " + n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6);
		}
		out.println();
		out.println();
	}
}