/*
 * NestingLoops.java
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
 */

import static java.lang.System.*; // Import for System.out.print to just use out.print
import java.util.*; // Import for Scanner utility

public class NestingLoops {
	public static void main(String[] args) {
		int slp = 250;
		// This is #1 = I'll call it "CN".
		for (int n = 1; n <= 3; n++) {
			for (char c = 'A'; c <= 'E'; c++) {
				out.println(c + " " + n);
				mySleep.sleep(slp);
			}
		}

		out.println("\n");

		// This is #2 = I'll call it "AB".
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				out.print( "(" + a + "," + b + ") ");
				mySleep.sleep(slp);
			}
			out.println();
		}

		out.println("\n");
	}
}