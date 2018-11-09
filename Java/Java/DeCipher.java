/*
 * DeCipher.java
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
import java.io.File;

public class DeCipher {
	public static char shiftLetter(char c, int n) { // Very confusing but obviously used to shift letters of the alphabet for encrypted message.
		int u = c;

		if (! Character.isLetter(c)) {
			return c;
		}
		u = (u + n);
		if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
			u -= 26;
		}
		if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
			u += 26;
		}

		return (char)u;
	}

	public static void main(String[] args) throws Exception { // Throws Exception is required for PrintWriter to compile correctly.

		// Get file name.
		String fileName = "Cipher.txt", cipher = "", msg;
		File f = new File(fileName);

		// Check if file exists and get line 1, which is message, and line 2, which is shift amount for alphabet.
		if (f.exists() && f.length() > 0) {
			Scanner input = new Scanner(f);
			msg = input.nextLine();
			int shift = input.nextInt();
			shift = (shift * -1);
		input.close();
		out.println("Getting message...\n");
		mySleep.sleep(1000);
		out.println("Secret message: " + msg);

		// This loop reads each letter of the message and gets the correct letter of the alphabet. Above shift was multiplied by -1 because the shiftLetter function above was originally written for a full shift of letters, this -1 does the reverse from the original shift put in the file.
		for (int i = 0; i < msg.length(); i ++) {
			cipher += shiftLetter(msg.charAt(i), shift);
			}
		out.println("Translated: " + cipher);
		}

		// If file does not exist print this message.
		else {
			out.println("No encrypted messages found!");
		}
	}
}