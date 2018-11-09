public class MoreVariablesAndPrinting {
	public static void main( String[] args ) {
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double metricAge, metricWeight, metricHeight;

		myName = "Michael S. Ifland";
		myAge = 44;		// not a lie
		myHeight = 70; // inches
		myWeight = 205; // lbs
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		metricAge = 365;
		metricWeight = 0.453592;
		metricHeight = 2.54;

		System.out.println( "" );

		System.out.println( "Let's talk about " + myName + "." );
		System.out.println( "" );

		System.out.println( "He's " + myHeight + " inches tall." );
		System.out.println( "He's " + myWeight + " pounds heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "" );

		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
		System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );
		System.out.println( "" );

		System.out.println( "We are now goint to convert these numbers to metric." );
		System.out.println( "" );

		System.out.println( "My age of " + myAge + " is days of " + (myAge * metricAge ));
		System.out.println( "My weight of " + myWeight + " is kilograms of " + (myWeight * metricWeight));
		System.out.println( "My height of " + myHeight + " is centimeters of " + (myHeight*metricHeight));
		System.out.println( "" );

		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "." );
		System.out.println( "" );
	}
}
