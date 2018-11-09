/*
 * CountingFor.java
 *
 * Copyright 2016 Michael Ifland <msifland@arch>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 * SEE BOTTOM OF FILE FOR BREAKDOWN EXPLANATION OF FOR LOOP
 */

import static java.lang.System.*;
import java.util.*;

public class CountingFor {

	public static void main (String[] args) {
		Scanner keys = new Scanner(System.in);
		int n;
		String message;

		out.println("Enter a message and I'll display it five time.");
		out.print("Message: ");
		message = keys.nextLine();

		for (n = 1 /*Sets start of loop*/; n<= 5/*Runs loops while this is true*/; n++/*Updates variable each loop run*/) {
			out.println(n + ". " + message);
		}

		out.println("\nNow I'll show it ten time and count by 5's.");
		for (n = 5; n <= 50; n += 5) /*This is a complete statement and does not need a body in brackets technically*/ {
			out.println(n + ". " + message);
		}

		out.println("\nFinally, three times counting backward.");
		for (n = 3;n > 0; n -= 1) {
			out.println(n + ". " + message);
		}
	}
}


/* Break down of the loop:
n = 1;
// check if ( n <= 5 ),
 which is true
System.out.println( 1 +
 "." + message );
n++; // so now n is 2
// check if ( n <= 5 ),
 which is true
System.out.println( 2 +
 "." + message );
n++; // so now n is 3
// check if ( n <= 5 ),
 which is true
System.out.println( 3 +
 "." + message );
n++; // so now n is 4
// check if ( n <= 5 ),
 which is true
System.out.println( 4 +
 "." + message );
n++; // so now n is 5
// check if ( n <= 5 ),
 which is true
System.out.println( 5 +
 "." + message );
n++; // so now n is 6
// check if ( n <= 5 ),
 which is false. The loop stops
*/