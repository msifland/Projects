/*
 * ArrayLinearSearch.java
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
 *
 */

import static java.lang.System.*; // Import for System.out.print to just use out.print
import java.util.*; // Import for Scanner utility

public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010, 8675309, 314, 271828};
		int toFind;

		out.print("There are " + orderNumbers.length);
		out.println(" orders in the database.");

		out.print("Orders: ");
		for (int num: orderNumbers) {
			out.print(num + "  ");
		}
		out.println();

		out.print("Which order to find? ");
		toFind = kb.nextInt();

		for (int num: orderNumbers) {
			if (num == toFind) {
				out.println(num + " found.");

			}
		}
	}
}