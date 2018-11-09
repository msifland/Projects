import java.util.*;

public class BMICalc{
	public static void main( String[] args ){
		getBMICat();
	}

	public static void getBMICat(){
		double bmi = getBMI();

		// String.format( "%.2f", bmi ); is used here for rounding a double to 2 decimal places
		System.out.println( "Your BMI is: " + (twoDigit.frmt("3", bmi )) );
       
		System.out.print( "BMI Category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "Very severly under weight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "Severly under weight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "Under weight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "Normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "Over weight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "Moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "Severly obese" );
		}
		else {
			System.out.println( "Very severly/\"morbidly\" obese" );
		}

		System.out.println( "Optimal BMI is 24.999 or less." );
		double bmi_over = (bmi - 24.99);
		System.out.println( "You are " + (twoDigit.frmt("3", bmi_over)) + " from optimal BMI" );
	}

	public static double getBMI(){
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "" );

		System.out.print( "What is your height in inches? " ); double height = keyboard.nextDouble();
		double meterConvert = (height * 0.0254);
		System.out.println( "Your height in meters is " + (twoDigit.frmt("3" , meterConvert )) );
		System.out.println( "" );

		System.out.print( "What is your weight in pounds? " ); double weight = keyboard.nextDouble();
		double kiloConvert = (weight * 0.453592);
		System.out.println( "Your weight in kilograms is " + twoDigit.frmt("3", kiloConvert )) ;
		System.out.println( "" );

		double bmi = (kiloConvert / (meterConvert * meterConvert));

		return bmi;
	}
}
