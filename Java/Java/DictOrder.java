import java.util.*;
import static java.lang.System.*;

public class DictOrder {
	public static void main( String[] args ) {
		Scanner keys = new Scanner(System.in);
		String name;

		out.print( "Make up the name of a programming language! " );
		name = keys.nextLine();

		if ( name.compareToIgnoreCase("c++") < 0 )
			out.println( name + " comes before c++" );
		if ( name.compareToIgnoreCase("c++") == 0 )
			out.println( name + "c++ is not a made up language!" );
		if ( name.compareToIgnoreCase("c++") > 0 )
			out.println( name + " comes after c++" );

		if ( name.compareToIgnoreCase("go") < 0 )
			out.println( name + " comes before go" );
		if ( name.compareToIgnoreCase("go") == 0)
			out.println( name + "is not a made up language!" );
		if ( name.compareToIgnoreCase("go") > 0 )
			out.println( name + " comes after go" );

		if ( name.compareToIgnoreCase("java") < 0 )
			out.println( name + " comes before java" );
		if ( name.compareToIgnoreCase("java") == 0 )
			out.println( name + "is not a made up language!" );
		if ( name.compareToIgnoreCase("java") > 0 )
			out.println( name + " comes after java" );

		if ( name.compareToIgnoreCase("perl") < 0 )
			out.println( name + " comes before perl" );
		if ( name.compareToIgnoreCase("perl") == 0 )
			out.println( name + "is not a made up language!" );
		if ( name.compareToIgnoreCase("perl") > 0 )
			out.println( name + " comes after perl" );

		if ( name.compareToIgnoreCase("python") < 0 )
			out.println( name + " comes before python" );
		if ( name.compareToIgnoreCase("python") == 0 )
			out.println( name + "is not a made up language!" );
		if ( name.compareToIgnoreCase("python") > 0 )
			out.println( name + " comes after python" );

		if ( name.compareToIgnoreCase("ruby") < 0 )
			out.println( name + " comes before ruby" );
		if ( name.compareToIgnoreCase("ruby") == 0 )
			out.println( name + "is not a made up language!" );
		if ( name.compareToIgnoreCase("ruby") > 0 )
			out.println( name + " comes after ruby" );

		if ( name.compareToIgnoreCase("visual basic") < 0 )
			out.println( name + " comes before visualbasic" );
		if ( name.compareToIgnoreCase("visual basic") == 0 )
			out.println( name + " is not a made up language!" );
		if ( name.compareToIgnoreCase("visual basic") > 0 )
			out.println( name + " comes after visualbasic" );
			/* Can also use .compareTo if you want to match case exactly. As another
			option for ignoring case you can use .toLowerCase().compareTo( "string".toLowerCase()
			*/
	}
}

