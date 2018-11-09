import java.util.Scanner;
import static java.lang.System.*;

public class GenderTitles {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title;

		out.print( "First name: " );
		String first = keyboard.next();
		out.print( "Last name: " );
		String last = keyboard.next();
		out.print( "Gender[m/f]: " );
		String gender = keyboard.next();
		out.print( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 )	{
			title = first;
		}
		else {
			if ( gender.equals("f") || gender.equals("F") ) {
				out.print( "Are you married, "+first+"?[y/n]: " );
				String married = keyboard.next();
				if ( married.equals("y") || married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			else {
				title = "Mr.";
			}
		}

		out.println( "\n" + title + " " + last );
	}
}
