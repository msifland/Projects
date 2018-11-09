/*
 * ArrayIntro.java
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

public class ArrayIntro {
	public static void main(String[] args) {
		String[] planets =  {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

		for (String p: planets) {
			out.println(p + "\t" + p.toUpperCase());
		}

		int a[] = {1, 2, 3, 4, 5};
		for (int b: a) {
			out.println(b);
		}
	}
}