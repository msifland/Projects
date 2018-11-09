/*
 * ItemNotFound.java
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

public class ItemNotFound {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String[] heroes = {
			"Aberus", "Achilles", "Aeneas", "Ajax", "Amphtryon",  "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
		};
		String guess;
		//boolean found;
		int count = 0;

		out.println("Pop Quiz!!!");
		out.print("Name any *mortal* hero from Greek mythology: ");
		guess = kb.nextLine();
		//found = false;
		for ( String hero: heroes) {
			if (guess.equals(hero)) {
				out.println("That's one of them!");
				count = 1;
				//found = true;
			}
		}
		//if (found == false) {
		if (count == 0) {
			out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}
}