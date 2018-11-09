import java.util.Scanner;

public class SecretWord {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess, secret2 = "c'mon";

		System.out.print( "What's the secret word? " );
		guess = keyboard.next();

		if ( guess.equals(secret) || guess.equals(secret2) ) {	System.out.println( "That's correct!" );
		}
		else {
			System.out.println( "Not, the secret word isn't \"" + guess + "\"." );
		}

		if ( guess == "pls" ) {
			System.out.println( "(This will never ever show, no matter what.)" );
		}
	}
}
