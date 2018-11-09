import static java.lang.System.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;

class Card {
	int value;
	String suit;
	String name;

	public String toString() {
		return name + " of " + suit;
	}
}

public class BlackJack {

	public static Card[] buildDeck() {
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

		int i = 0;
		Card[] deck = new Card[52];

		for(String s: suits) {
			for(int v = 2; v <= 14; v++) {
				Card c = new Card();
				c.suit = s;
				c.name = names[v];
				if(v == 14) {
					c.value = 11;
				}
				else if(v > 10) {
					c.value = 10;
				}
				else {
					c.value = v;
				}

				deck[i] = c;
				i++;
			}
		}
		return deck;
	}

	public static void displayDeck(Card[] deck) {
		for(Card c: deck)
			out.println(c.value + "\t" + c);
	}

	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(in);
		boolean run = true;
		double bet = 0;
		double payout = 0;
		double bankroll = 0;
		double lastbankroll = 0;
		double finalroll = 0;
		String dec = "";
		String dec2 = "";
		String dec3 = "";
		String yn = "";
		File f = new File("BlackJack.txt");

		out.println("This is BlackJack. Get ready to play.\n\n");
		sleep(1000);

		// See if bankroll file exists and get bankroll amount.
		if(f.exists() && f.length() > 0) {
			Scanner fileInput = new Scanner(f);
			bankroll = fileInput.nextDouble();
			lastbankroll = bankroll;
			dec = (String.format("%.2f", bankroll));
			out.print("Your current bankroll is: " + dec + "\nWould you like to use this bankroll?[y/n] ");
			Thread.sleep(500);
			yn = kb.nextLine();

			// If you want to start a new bankroll.
			if(yn.equals("n")) {
				bankroll = 0;
				out.print("\nHow much is your new starting bankroll? ");
				// Make sure next input is an integer
				while(!kb.hasNextInt()) {
					out.print("Didn't get that, try again...");
					kb.next();
				}
				bankroll = kb.nextInt();
				lastbankroll = bankroll;
			}
			Thread.sleep(500);
		}
		else { // If bankroll file does not exist. create it.
			out.println("No current bankroll found. How much money are you starting with? ");
			// Make sure next input is an integer
			while(kb.hasNextInt()) {
				out.print("Didn't get that, try again...");
				kb.next();
			}
			bankroll = kb.nextInt();
		}

		run_loop:
		while(run == true) {
			Card[] deck = buildDeck();
			if(bankroll <= 0.00000000) {
				break;
			}
			nextint_loop:
			out.print("\nEnter bet amount or 'q' to quit: ");
			while(kb.hasNextInt()) {
				bet = kb.nextInt();

				out.println();
				out.println("Dealing...");
				Thread.sleep(1000);

				// Computer draws first and you see the card that is showing and start a total for the computer, which will be added to later.
				int total2 = 0;
				String draw2;
				int chosen2;
				Card picked2;
				chosen2 = (int)(Math.random()*deck.length);
				picked2 = deck[chosen2];

				out.println("Computer has a " + picked2 + " showing.");
				total2 = total2 + picked2.value;
				out.println("Total: " + total2 + "\n");
				sleep(1000);

				// Player draws 2 cards next and start a total to be added to.
				int chosen;
				Card picked;
				int total = 0;
				String draw;
				chosen = (int)(Math.random()*deck.length);
				picked = deck[chosen];
				out.print("You have drawn a " + picked + " and a ");
				total = total + picked.value;
				chosen = (int)(Math.random()*deck.length);
				picked = deck[chosen];
				out.println(picked);
				total = total + picked.value;
				out.println("Total: " + total);
				if(total == 21) {
					out.println("BLACKJACK!!! Don't hit!!!");
				}
				sleep(1000);

				player_loop:
				// Actual game loop for player which allows hit or stay and adds to total and stores it to be compared against computer.
				do {
					out.println();
					out.print("Hit or Stay[h/s] ");
					draw = kb.next();
					if(draw.equals("h")) {
						chosen = (int)(Math.random()*deck.length);
						picked = deck[chosen];

						out.println("You drew a " + picked + " out of the deck,");
						if(picked.value == 11) {
							out.print("Would you like to use your Ace as a '1' or '11'? ");
							int oneEleven;
							oneEleven = kb.nextInt();
							if(oneEleven == 1) {
								picked.value = 1;
							}
							else {
								picked.value = 11;
							}
						out.print("Your Ace is ");
					}
						out.println("worth " + picked.value + " points.");
						total = (total + picked.value);
						out.println("Your total is: " + total);

						if(total == 21) {
							out.println();
							out.println("BLACKJACK...");
							sleep(1000);
							break;
						}
						else if (total > 21) {
							out.println();
							out.println("BUSTED!!! You lose!!!");
							sleep(1000);
							bankroll = (bankroll - bet);
							dec = (String.format("%.2f", bankroll));
							out.println("You now have a bankroll of " + dec);
							continue run_loop;
						}
					}
					else {
						out.println("Your total is " + total);
						break;
					}
					sleep(500);
				} while(total <= 21); // End of player_loop

				// Computers turn
				out.println("\n\n");
				out.println("Computer's turn...");
				sleep(1000);

				computer_loop:
				do {
					out.println();
					out.println("Drawing a card...");

					chosen2 = (int)(Math.random()*deck.length);
					picked2 = deck[chosen2];

					out.println("Computer picked a " + picked2 + " out of the deck,");
					if(picked2.value == 11 && (picked2.value + total2) > 21) {
						int oneEleven2;
						oneEleven2 = 1;
						if(oneEleven2 == 1) {
							picked2.value = 1;
						}
						else {
							picked2.value = 11;
						}
						out.print("Computer's Ace is ");
					}
					out.println("worth " + picked2.value + " points.");
					total2 = (total2 + picked2.value);
					out.println("Computer's total is: " + total2);

					if (total2 == 21) {
						out.println();
						out.println("Blackjack...");
						sleep(1000);
						break;
					}
					else if (total2 > 21) {
						if(total == 21)  {
							payout = ((bet / 2) * 3);
							dec = (String.format("%.2f", payout));
							bankroll = (bankroll + payout);
							dec2 = (String.format("%.2f", bankroll));
							out.println("Computer BUSTED, you got BLACKJACK!!!\nYour payout is " + dec + "\nYour bankroll now is " + dec2);
							continue run_loop;
						}
						else {
							bankroll = (bankroll + bet);
							dec = (String.format("%.2f", bankroll));
							out.println();
							out.println("COMPUTER BUSTED!!!\nYou now have a bankroll of " + dec);
							sleep(1000);
							continue run_loop;
						}
					}
					sleep(1000);
				} while(total2 < 17); // End of computer_loop
				out.println();

				// Display results of the hand.
				if(total == total2) {
					out.println("YOU TIED. No payout.");
					continue run_loop;
				}
				else if(total == 21) {
					payout = ((bet / 2) * 3);
					dec = (String.format("%.2f", payout));
					bankroll = (bankroll + payout);
					dec2 = (String.format("%.2f", bankroll));
					out.println("BLACKJACK!!!, YOU WIN!!! " + dec + "\nYou now have a bankroll of " + dec2);
					continue run_loop;
				}
				else if(total2 == 21) {
					bankroll = (bankroll - bet);
					dec = (String.format("%.2f", bankroll));
					out.println("COMPUTER GOT BLACKJACK, YOU LOOOOOOSSSSEE...\nYou now have a bankroll of " + dec);
					continue run_loop;
				}
				else if((total > total2) && (total <= 21) || (total2 > 21)) {
					payout = bet;
					dec = (String.format("%.2f", payout));
					bankroll = (bet + bankroll);
					dec2 = (String.format("%.2f", bankroll));
					out.println("\n\nYOU WIN!!! " + payout + "\nYou now have a bankroll of " + dec2);
					continue run_loop;
				}
				else {
					bankroll = (bankroll - bet);
					dec = (String.format("%.2f", bankroll));
					out.println("\n\nYOU LOOOOOOOOSSSSSEEEE!!!!, YOU SUCK!!\nYou now have a bankroll of " + dec);
					continue run_loop;
				}
			} // end of nextint_loop
			run = false;

		// Write bankroll to file
		PrintWriter write = new PrintWriter(f);
			write.println(bankroll);
		write.close();
		Thread.sleep(500);

		// Show how much was won from starting bankroll
		dec = (String.format("%.2f", bankroll));
		dec2 = (String.format("%.2f", lastbankroll));
		out.println("\nYour starting bankroll was " + dec2 + "\nYour bankroll now is " + dec);
		Thread.sleep(500);
		out.println();

		// Determine if won or lost total
		if(bankroll > lastbankroll) {
			finalroll = (bankroll - lastbankroll);
			dec3 = (String.format("%.2f", finalroll));
			out.println("You have won " + dec3);
		}
		else if( bankroll < lastbankroll) {
			finalroll = (lastbankroll - bankroll);
			dec3 = (String.format("%.2f", finalroll));
			out.println("You have lost " + finalroll);
		}
		out.println();
		Thread.sleep(500);
		out.println("Saving bankroll.");
		Thread.sleep(500);
		out.println();
		exit(0);
		}
		out.println("You are out of money");
		f.delete();
	}

	public static void sleep(int slp) {
		try{
			Thread.sleep(slp);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
