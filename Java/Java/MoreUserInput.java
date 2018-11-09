import java.util.Scanner;

public class MoreUserInput {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String firstName;
		String lastName;
		String loginName;
		int grade;
		int idNum;
		double gpa;

		System.out.println( "Please enter the following information so I can sell it for a profit!" );
		System.out.println();

		System.out.print( "First name: " );
		firstName = keyboard.next();
		System.out.print( "Last name: " );
		lastName = keyboard.next();
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		if ( grade < 9 ) {
			System.out.println( "Grade number must be above 8. Setting grade number at 9." );
			grade = 9;
		}
		System.out.print( "Student ID: " );
		idNum = keyboard.nextInt();
		System.out.print( "Login: " );
		loginName = keyboard.next();
		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		System.out.println( "" );

		System.out.println( "Your information:" );
		System.out.println( "	Login: " + loginName );
		System.out.println( "	ID: " + idNum );
		System.out.println( "	Name: " + firstName + " " + lastName );
		System.out.println( "	GPA: " + gpa );
		System.out.println( "	Grade: " + grade );
	}
}
