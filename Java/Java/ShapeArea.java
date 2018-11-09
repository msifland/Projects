import java.util.*;
import static java.lang.System.*;

public class ShapeArea {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int choice;
		double area;

		out.print("Shape Area Calculator Version 0.1");
		out.println(" (c) 2016 LJtHW Sample Output, Inc.");

		do {
			out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			out.println("1) Triangle");
			out.println("2) Circle");
			out.println("3) Rectangle");
			out.println("4) Square");
			out.println("5) Quit");
			out.print(">>> ");
			choice = keys.nextInt();

			if (choice == 1) {
				out.print("\nBase: ");
				int b = keys.nextInt();
				out.print("Height: ");
				int h = keys.nextInt();
				area = computeTriangleArea(b, h);
				out.println("The area is " + area);
			}
			else if (choice == 2) {
				out.print("\nRadius: ");
				int radius = keys.nextInt();
				area = computeCircleArea(radius);
				out.println("The area is " + area);
			}
			else if (choice == 3) {
				out.print("\nLength: ");
				int q = keys.nextInt();
				out.print("Width: ");
				int w = keys.nextInt();
				out.println("The area is " + computeRectangleArea(q, w));
			}
			else if (choice == 4) {
				out.print("\nLength & Width: ");
				int hw = keys.nextInt();
				out.println("The area is " + computeSquareArea(hw));
			}
			else if (choice != 5) {
				out.println("ERROR!");
			}
		} while (choice != 5);
	}

	public static int computeSquareArea(int wh) {
		int A;
		A = (wh * wh);
		return A;
	}

	public static double computeTriangleArea(int base, int height) {
		double A;
		A = 0.5 * base * height;
		return A;
	}

	public static double computeCircleArea(int radius) {
		double A;
		A = Math.PI * radius * radius;
		return A;
	}

	public static int computeRectangleArea(int length, int width) {
		return (length * width);
	}
}
