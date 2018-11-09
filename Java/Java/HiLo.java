import static java.lang.System.*;
import java.util.Scanner;

// This is a simple guessing game to see if you can guess a random number between
// 1 and 100
public class HiLo {
	public static void main( String[] args ) {
		Scanner keys = new Scanner(System.in);
		int secret, guess;
		// Generate random number between 1 and 100
		secret = 1 + (int)( 100*Math.random() );

		// First guess
		out.println( "I'm thinking of a number between 1 and 100." );
		out.println( "Try to guess it." );
		out.print( "> " );
		guess = keys.nextInt();

		// Set up loop to keep guessing if guess is wrong. Give hints each time
		// if guess is too hi or too low
		while ( secret != guess ) {
			if ( guess < secret ) {
				out.print( "Sorry your guess is too low. Try again...\n> " );
			}
			if ( guess > secret ) {
				out.print( "Sorry your guess is too high. Try again...\n> " );
			}
			guess = keys.nextInt();
		}

		// If guess is correct
		out.println( "You guessed it!!! Wow you're good!!!" );
	}
}
