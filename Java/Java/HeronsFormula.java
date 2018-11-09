import static java.lang.System.*;
import java.util.*;

public class HeronsFormula {
	public static void main(String[] args) {
		double a, g;
		String tws = "A triangle with sides ";

		a = triangleArea(3, 3, 3);
		out.println("A triangle with sides 3,3,3 has area " + (twoDigit.frmt("3", a)));

		a = triangleArea(3, 4, 5);
		out.println("A triangle with sides 3,4,5 has area " + a);
		g = triangleArea(7, 8, 9);
		out.println(tws + "7,8,9 has area " + (twoDigit.frmt("2", g)));

		out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13));
		out.println(tws + "10,9,11 has area " + (twoDigit.frmt("4", triangleArea(10, 9, 11))));
		out.println(tws + "8,15,17 has area " + triangleArea(8, 15, 17));
		out.println(tws + "9,9,9 has area " + (twoDigit.frmt("10", triangleArea(9, 9, 9))));
	}

	// this function computes the area of a triangle with side lenths a, b, & c
	public static double triangleArea(int a, int b, int c) {
		double s, A;

		s = (a+b+c) / 2.0;
		A = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		// After computing the area, you must "return" the computed value
		return A;

	}
}
