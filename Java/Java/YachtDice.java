import static java.lang.System.*;

public class YachtDice {
	public static void main(String[] args) {
		int r1, r2, r3, r4, r5, r6;
		boolean allSame;
		int count = 0;

		do {
			r1 = 1 + (int)(6*Math.random());
			r2 = 1 + (int)(6*Math.random());
			r3 = 1 + (int)(6*Math.random());
			r4 = 1 + (int)(6*Math.random());
			r5 = 1 + (int)(6*Math.random());
			r6 = 1 + (int)(6*Math.random());
			showDice(r1);
			showDice(r2);
			showDice(r3);
			showDice(r4);
			showDice(r5);
			showDice(r6);
			allSame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 && r5 == r6);
			System.out.println("You rolled: " + r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);
			count += 1;
			out.println("Roll number " + count + "\n");

			//my own sleep class milliseconds
			mySleep.sleep(10);

		} while ( !allSame);
		System.out.println("The Yahct!!!");
		out.println("It took " + count + " rolls to get the Yacht.");
	}

	public static void showDice(int roll) {
		out.println("+---+");
		if (roll == 1) {
			out.println("|   |");
			out.println("| o |");
			out.println("|   |");
		}
		else if (roll == 2) {
			out.println("|o  |");
			out.println("|   |");
			out.println("|  o|");
		}
		else if (roll == 3) {
			out.println("|o  |");
			out.println("| o |");
			out.println("|  o|");
		}
		else if (roll == 4) {
			out.println("|o o|");
			out.println("|   |");
			out.println("|o o|");
		}
		else if (roll == 5) {
			out.println("|o o|");
			out.println("| o |");
			out.println("|o o|");
		}
		else if (roll == 6) {
			out.println("|o o|");
			out.println("|o o|");
			out.println("|o o|");
		}
		out.println("+---+");
	}
}
