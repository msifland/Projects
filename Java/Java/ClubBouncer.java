import java.util.Scanner;

public class ClubBouncer {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		boolean onGuestList = false;
		int age;
		String onList;
		double allure;
		String gender;

		System.out.print( "I am the bouncer and I need to ask you some questions before I can let you enter. First, are you on the guest list?[y/n] " );
		onList = keyboard.next();
		if ( onList.equals("y") ) {
			onGuestList = true;
		}
		if ( onList.equals("n") ) {
			onGuestList = false;
		}

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		System.out.print( "Are you male or female?[m/f] " );
		gender = keyboard.next();
		System.out.print( "How attractive are you? Scale of 1 to 10: " );
		allure = keyboard.nextDouble();

		if ( onGuestList || age >= 21 || ( gender.equals("f") && allure >= 8 ) ) {
			System.out.println( "\nYou are allowed to enter, go on in!!" );
		}
		else {
			System.out.println( "\nYou can NOT go in. Get the hell out of here!!" );
		}
	}
}
