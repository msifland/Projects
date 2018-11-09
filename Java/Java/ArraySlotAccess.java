import static java.lang.System.*;
import java.util.*;
public class ArraySlotAccess {
	public static void main(String[] args) {
		int[] arr = new int[10000];

		// We almost always use a for loop to access each slot of and array.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + (int)(100*Math.random());
		}

		// Displaying all the values in an array usually looks like this
		out.print("Values: ");
		for(int i = 0; i < arr.length; i++) {
			out.print(arr[i] + " ");
		}
		out.println();

		////////////////////////////////////////
		// But let's break this down step-by-step
		// Put a number into each slot of the array, one at a time.
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;

		// Then display the values in those slots, one at a time.
		out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		////////////////////////////////////////
		// Put a random number 1-100 into each slot of the array, one at a time.
		arr[0] = 1 + (int)(100*Math.random());
		arr[1] = 1 + (int)(100*Math.random());
		arr[2] = 1 + (int)(100*Math.random());

		// Display them again one at a time.
		out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		/////////////////////////////////////////////
		// This is a bit silly, but try to understand it.
		int m = 0;
		arr[m] = 1 + (int)(100*Math.random());
		m = 1;
		arr[m] = 1 + (int)(100*Math.random());
		m = 2;
		arr[m] = 1 + (int)(100*Math.random());

		// Display them again.
		out.print("Values: ");
		m = 0;
		out.print(arr[m] + " ");
		m = 1;
		out.print(arr[m] + " ");
		m = 2;
		out.print(arr[m] + " ");
		out.println();

		/////////////////////////////////////
		// This is even more silly but it works.
		int n = 0;
		arr[n] = 1 + (int)(100*Math.random());
		n++;
		arr[n] = 1 + (int)(100*Math.random());
		n++;
		arr[n] = 1 + (int)(100*Math.random());
		n++;

		// Display them again.
		out.print("Values: ");
		n = 0;
		out.print(arr[n] + " ");
		n++;
		out.print(arr[n] + " ");
		n++;
		out.print(arr[n] + " ");
		n++;
		out.println();

		///////////////////////////////////////////
		// Now does using a loop make more sense?
		for(int q = 0; q < arr.length; q++) {
			arr[q] = 1 + (int)(100*Math.random());
		}

		// I hope so. If not, read through this code again more slowly
		out.print("Values: ");
		for(int q = 0; q < arr.length; q++) {
			out.print(arr[q] + " ");
		}
		out.println();
	}
}