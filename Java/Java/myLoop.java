/*
 * This is just a custom example of the three java loops
 */

import static java.lang.System.*;
import java.util.*;

public class myLoop {
	public static void main(String[] args) throws Exception {
		out.println("I have created my own custom loop java file for examples to use later on.");
		mySleep.sleep(500);

		Scanner kb = new Scanner(System.in);


		// Loop while loop with for string array loop.
		String element = "";
		String[] myArray = new String[10000];
		String[] myArray2 = new String[0]; // Declare 2nd array for dynamic array size.


		out.println("\nThis is a 'while' loop that lets you enter words into an array, then adjusts the array size dynamically. It also detects if you hit 'ENTER' without typing a string and ends the loop. Then uses a 'for' string loop, which is a different structure than a regular for loop, which is displayed further down. to print the array of words.");
		out.print("\nAdd some words to your array one at at time. Type a word or several words and hit enter OR just press 'ENTER' without typing a word at anytime to quit: ");
		element = kb.nextLine();

		int i = 0;
		int j = 0; // Declare 2nd int for dynamic array size.
		while(!element.isEmpty()) {
			myArray[i] = element;
			i++;
			j++; // Increasing array size as input is typed.
			out.print("Enter another: ");
			element = kb.nextLine();
		}
		// Use 2nd array to copy from first array making sure array[#] size is exactly the size of items entered from user input.
		myArray2 = Arrays.copyOf(myArray, j);
		out.println("Now displaying your array: ");
		// This prints all the words in the array in order while adding a space after each one. This is a string array for loop.
		for(String dis: myArray2) {
			out.print(dis + " ");
		}
		out.println();
		out.println();


		// Loop two the while loop.
		out.println("This is a simple 'while' loop that asks for input of a low and high number and then asks for a number to count by. Then counts up by the interval you have specified.");
		out.print("Enter a number(no decimals). ");
		int a = kb.nextInt();
		out.println();
		out.print("Enter a number hight than the last. ");
		int b = kb.nextInt();
		out.println();
		out.print("By what interval would you like to add? ");
		int c = kb.nextInt();
		out.println();

		while(a < b) {
			out.println("Increasing " + a + " to " + (a + c) + " because you said increase by " + c);
			a = (a + c);
			mySleep.sleep(50);
		}
		out.println();


		// Loop three the for loop.
		out.println("This is a simple 'for' loop that does the same as the last one.");
		out.print("Enter a number(no decimals). ");
		a = kb.nextInt();
		out.println();
		out.print("Enter a number hight than the last. ");
		b = kb.nextInt();
		out.println();
		out.print("By what interval would you like to add? ");
		c = kb.nextInt();
		out.println();
		for(a = 0; a < b; a = (a + c)) {
			out.println("Increasing " + a + " to " + (a + c) + " because you said increase by " + c);
			mySleep.sleep(50);
		}
		out.println();


		// Loop four the do while loop.
		out.println("This is a 'do while' loop that does the same as the last one.");
		out.print("Enter a number(no decimals). ");
		a = kb.nextInt();
		out.println();
		out.print("Enter a number hight than the last. ");
		b = kb.nextInt();
		out.println();
		out.print("By what interval would you like to add? ");
		c = kb.nextInt();
		out.println();
		do {
			out.println("Increasing " + a + " to " + (a + c) + " becasue you said increase by " + c);
			a = (a + c);
			mySleep.sleep(50);
		}
		while(a < b);
		out.println();
	}
}
