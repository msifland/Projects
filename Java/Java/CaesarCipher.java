/*
 * CaesarCipher.java
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
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher {
	/*
	 * Returns the character shifted by the given number of letters.
	 */
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

	public static void main(String[] args) throws Exception { // Throws Exception must be here for PrintWriter to compile correctly.

		Scanner keys = new Scanner(System.in);
		String plainText, cipher = "";
		int shift;

		// Store message and shift number into variables
		out.print("Message: ");
		plainText = keys.nextLine();
		out.print("Shift[0-26]: ");
		shift = keys.nextInt();

		// This loop takes each letter from the message and shifts it through the alphabet shift number to create the encrypted message.
		for (int i = 0; i < plainText.length(); i++) {
			cipher += shiftLetter(plainText.charAt(i), shift);
		}
		out.println("\nEncrypted message: " + cipher + "\n");
		mySleep.sleep(500);

		// Printing encrypted message to a file called Cipher.txt. Also printing shift number for late decryption with DeCipher.java program.
		String fileName = "Cipher.txt";
		File f = new File(fileName);
		PrintWriter write = new PrintWriter(f);
			out.println("Now stored in secret file Cipher.txt");
			write.println(cipher);
			write.println(shift);
		write.close();
	}
}