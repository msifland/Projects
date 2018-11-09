import static java.lang.System.*;
public class SphereCalcTester {
	public static void main( String[] args ) {

		SphereCalc4 c = new SphereCalc4(5);


		if ( isNear(c.getSurfaceArea(), 314.159265359) ) {
			out.println("Pass: surfaceArea for " + c.getRadius());
		}
		else {
			out.println("Fail: surfaceArea not what was expected");
		}
		if( isNear(c.getVolume(), 523.598775598) ) {
			out.println("Pass: volume for " + c.getRadius());
		}
		else {
			out.println("Fail: volume not what was expected");
		}

		SphereCalc4 d = new SphereCalc4(0.00001);

		if ( isNear(d.getSurfaceArea(), 0.125663706) ) {
			out.println("Pass: surfaceArea for " + d.getRadius());
		}
		else {
			out.println("Fail: surfaceArea not what was expected " + d.getSurfaceA() );
		}
		if ( isNear(d.getVolume(), 4.18879E-3) ) {
			out.println("Pass: volume for " + d.getRadius());
		}
		else {
			out.println("Fail: volume not what was expected " + d.getVolume() );
		}
	}

	public static boolean isNear( double a, double b ) {
		return Math.abs(a - b) < 1E-9;
	}
}