import static java.lang.System.*;
import java.util.Scanner;

public class EnterPin {
	public static void main( String[] args ) {
		Scanner keys = new Scanner(System.in);
		int pin, pinEntry;
		String psswd = "password", psswdEntry;
		pin = 1234;

		out.println( "Welcome to the bank of Java." );

		out.print( "\nEnter your password: " );
		psswdEntry = keys.nextLine();
		while ( !psswdEntry.equals(psswd) ) {
			out.print( "\nIncorrect password. Try again: " );
			psswdEntry = keys.nextLine();
		}

		out.print( "\nPassword accepted. Enter your PIN: " );
		pinEntry = keys.nextInt();
		while ( pinEntry != pin ) {
			out.print( "\nIncorrect PIN. Try again: ");
			pinEntry = keys.nextInt();
		}
		out.println( "\nPIN accepted. Your account balance is 456.23" );
	}
}
