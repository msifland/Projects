import static java.lang.System.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;

public class ReceiptRevisitedException {
	public static void main(String[] args) {
		PrintWriter fileout;
		twoDigit two = new twoDigit();
		Scanner keys = new Scanner(System.in);

		double price;
		double gallons;
		double total;

		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch (IOException err) {
			out.println("Sorry, I can't open 'receipt.txt' for writing.\nIt may be a 'read only' file.");
			fileout = null;
			System.exit(1);
		}
		out.print("What is the price of gas per gallon right now? ");
		price = keys.nextDouble();
		out.print("How many gallons of gas would you like? ");
		gallons = keys.nextDouble();
		total = (price * gallons);
		mySleep.sleep(1000);
		out.println("Your total is: " + total);
		mySleep.sleep(1000);
		out.println("Writing 'receipt.txt' with totals to current directory.");

		fileout.println("+------------------------+");
		fileout.println("|           NEW          |");
		fileout.println("|     Corner Store       |");
		fileout.println("|                        |");
		fileout.println("|  07-19-2016   8:12PM   |");
		fileout.println("|  Gallons:      " + two.frmt("2", gallons) + "   |");
		fileout.println("|  Price/Gal:   $" + two.frmt("2", price) +  "    |");
		fileout.println("|                        |");
		fileout.println("|  Fuel Total: $ " + two.frmt("2", total) +   "   |");
		fileout.println("|                        |");
		fileout.println("+------------------------+");
		fileout.close();
	}
}
