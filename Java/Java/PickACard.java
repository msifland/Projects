import static java.lang.System.*;
import java.util.*;
class Card {
	int value;
	String suit;
	String name;

	public String toString() {
		return name + " of " + suit;
	}
}

public class Blackjack {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int total = 0;
		String draw;
		do {
			out.println();
			out.print("Draw a card[y/n] ");
			draw = kb.next();
			if(draw.equals("y")) {
			Card[] deck = buildDeck();
			// displayDeck

			int chosen = (int)(Math.random()*deck.length);
			Card picked = deck[chosen];

			out.println("You picked a " + picked + " out of the deck,");
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
			out.println("worth " + picked.value + " points in Blackjack.");
			total = (total + picked.value);
			out.println("Your total is: " + total);

			if (total > 21) {
				out.println("BUSTED!!!");
				break;
			}
			}
			else {
				out.println("Your total is " + total);
				break;
			}
			} while(total <= 21);


		out.println("\n\n");
		out.println("Computer's turn...");
		int total2 = 0;
		String draw2;
		do {
			out.println();
			out.println("Drawing a card...");
			Card[] deck2 = buildDeck();
			// displayDeck

			int chosen2 = (int)(Math.random()*deck2.length);
			Card picked2 = deck2[chosen2];

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
			out.println("worth " + picked2.value + " points in Blackjack.");
			total2 = (total2 + picked2.value);
			out.println("Computer's total is: " + total2);

			if (total2 > 21) {
				out.println("BUSTED!!!");
				break;
			}
			//else {
			//	out.println("Computer's total is " + total2);
				//break;
			//}
			} while(total2 <= 17);

			if((total > total2) || (total2 > 21)) {
				out.println("\n\nYOU WIN!!! GREAT JOB!!!");
			}
			else {
				out.println("\n\nYou loooooooossssseeee!!!!, YOU SUCK!!!");
			}
	}

	public static Card[] buildDeck() {
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", " Ace"};

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
}