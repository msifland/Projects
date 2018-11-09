import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Craps {

	public static void main(String[] args) throws Exception {
		// Set up scanner and file to save.
		Scanner kb = new Scanner(in);
		File f = new File("craps_bankroll");

		// Set up variables.
		String yn = "";
		int bet = 0;
		double pay = 0.00;
		double totalpay = 0.00;
		int roll = 0;
		int die1 = 0;
		int die2 = 0;
		int total = 0;
		int odds = 0;
		int point = 0;
		double bankroll = 0.00;
		double lastbankroll = 0.00;
		double finalroll = 0.00;
		String dec = ""; // For decimal places of 2
		String dec2 = ""; // Same as above
		String dec3 = ""; // Same
		boolean run = true;

		// Begin game.
		out.println("---- THIS IS CRAPS. PASSLINE ONLY ----\n\n");
		Thread.sleep(1000);

		// See if bankroll file exists, if not enter a bankroll amount.
		if(f.exists() && f.length() > 0) {
			Scanner fileInput = new Scanner(f);
			bankroll = fileInput.nextDouble();
			lastbankroll = bankroll;
			dec = (String.format("%.2f", bankroll));
			out.print("Your current bankroll is: " + dec + "\nWould you like to use this bankroll?[y/n] ");
			Thread.sleep(500);
			yn = kb.nextLine();

			// If you don't want to use saved bankroll, create new one.
			if(yn.equals("n")) {
				bankroll = 0;
				out.print("\nWhat is your new starting bankroll? ");
				// Make sure next input is an integer.
				while(!kb.hasNextInt()) {
					out.print("Didn't get that, try again...");
					kb.next();
				}
				bankroll = kb.nextInt();
				lastbankroll = bankroll;
			}
			Thread.sleep(1000);
		}
		else { // If bankroll file does not exist, creat it.
			out.println("No current bankroll found. How much money are you starting with? ");
			// Make sure next input is an integer
			while(!kb.hasNextInt()) {
				out.print("Didn't get that, try again... ");
				kb.next();
			}
			bankroll = kb.nextInt();
		} // End of setting up bankroll.

		run_loop:
		while(run == true) {
			if(bankroll <= 0){
				run = false;
				break;
			}
			// How much are we betting.
			out.print("\nHow much would you like to bet on the Pass Line? ");
			// Checking for number or letter from input.

			nextint_loop:
			while(kb.hasNextInt()) {
				bet = kb.nextInt();
				if(bankroll <= 0){
				continue run_loop;
				}

				// Roll and set point.
				out.println("\nSetting point...");
				Thread.sleep(1000);
				die1 = 1 + (int)(6 * Math.random());
				die2 = 1 + (int)(6 * Math.random());
				total = (die1 + die2);
				out.println("You rolled " + die1 + " and " + die2 + "\nTotal: " + total);
				out.println();
				Thread.sleep(500);
				// If crapped out or roll seven/eleven before point is set.
				if(total == 2 || total == 3 || total == 12) {
					pay = bet;
					dec2 = (String.format("%.2f", pay));
					out.println("You lose, your loss is: " + dec2);
					bankroll = bankroll - pay;
					dec = (String.format("%.2f", bankroll));
					out.println("Your bankroll is now: " + dec);
					Thread.sleep(500);
					out.println();
					out.print("Enter bet amount or type 'q' to quit: ");
				}
				else if(total == 7 || total == 11) {
					pay = bet;
					dec2 = (String.format("%.2f", pay));
					out.println("You win. your payout is: " + dec2);
					bankroll = bankroll + pay;
					dec = (String.format("%.2f", bankroll));
					out.println("Your bankroll is now: " + dec);
					Thread.sleep(500);
					out.println();
					out.print("Enter bet amount or type 'q' to quit: ");
				} // End of pre-point roll.
				else { // Point is set.
					out.println("The point is " + total);
					out.println();
					point = total;
					Thread.sleep(1000);

					// Are we playing passline odds bet.
					out.print("Would you like to play odds?[y/n] ");
					kb.nextLine();
					yn = kb.nextLine();
					Thread.sleep(500);

					// If betting odds how much is total bet.
					if(yn.equals("y")) {
						if(point == 6 || point == 8) {
							odds = (bet * 3);
						}
						else if(point == 5 || point == 9) {
							odds = (bet * 4);
						}
						else if(point == 4 || point == 10) {
							odds = (bet * 5);
						}
						out.println("We are playing the standard 3-4-5x odds. That makes your odds bet " + odds + ".\nWhich makes your total bet " + (odds + bet));
						Thread.sleep(3000);
					}
					else { // Not betting odds.
						out.println("OK, no odds bet, passline only.");
						odds = 0;
						Thread.sleep(500);
					}
					out.println();

					seven_loop:
					// Rolling to get point or crap out.
					while(total != 7) {
						roll++;
						die1 = 1 + (int)(6 * Math.random());
						die2 = 1 + (int)(6 * Math.random());
						total = (die1 + die2);
						out.println("Roll " + roll + "\nDie 1: " + die1 + 	"\nDie2: " + die2 + "\nTotal: " + total);
						out.println();
						Thread.sleep(500);
						if(total == point) {
							out.println("YOU WIN!!!");
							roll = 0;
							if(point == 6 || point == 8) {
								pay = (bet + (((odds / 5) * 6) + odds));
								dec = (String.format("%.2f", pay));
								out.println("Your payout is: " + dec);
							}
							if(point == 5 || point == 9) {
								pay = (bet + (((odds / 2) * 3) + odds));
								dec = (String.format("%.2f", pay));
								out.println("Your payout is: " + dec);
							}
							if(point == 4 || point == 10) {
								pay = (bet + (((odds / 1) * 2) + odds));
								dec = (String.format("%.2f", pay));
								out.println("Your payout is: " + dec);
							}
							bankroll = (bankroll + (totalpay + pay));
							dec = (String.format("%.2f", bankroll));
							out.println("Your bankroll is now " + dec);
							out.println();
							out.print("Enter bet amount or type 'q' to quit: ");
							// Add break to exit this while loop.
							break;
						} // End if point == total
					} // End while != 7 loop

					// If crapped out.
					if(total == 7) {
						roll = 0;
						out.println("CRAPS!!! YOU LOSE " + (bet + odds));
						Thread.sleep(500);
						bankroll = ((bankroll - bet) - odds);
						dec = (String.format("%.2f", bankroll));
						out.println("Your bankroll is now " + dec);
						out.println();
						out.print("Enter bet amount or type 'q' to quit: ");
					} // End total == 7
				} // End else { point is set condition.
			} // End while(kb.hasNextInt) loop and go back to top.

			// Write bankroll to file to be read later.
			PrintWriter write = new PrintWriter(f);
				write.println(bankroll);
			write.close();
			Thread.sleep(500);

			// Show how much was won from starting bankroll.
			dec2 = (String.format("%.2f", lastbankroll));
			dec = (String.format("%.2f", bankroll));
			out.println("\nYour starting bankroll was " + dec2 + "\nYour bankroll now is " + dec);
			Thread.sleep(500);
			out.println();
			if(bankroll > lastbankroll) {
				finalroll = (bankroll - lastbankroll);
				dec3 = (String.format("%.2f", finalroll));
				out.println("You have won " + dec3);
			}
			else if(bankroll < lastbankroll) {
				finalroll = (lastbankroll - bankroll);
				dec3 = (String.format("%.2f", finalroll));
				out.println("You have lost " + dec3);
			}
			out.println();
			Thread.sleep(500);
			out.println("Saving bankroll.");
			Thread.sleep(500);
			out.println();
			exit(0);
		} // End of run_loop
		out.println("You are out of money.");
		out.println();
		f.delete();
	}
}