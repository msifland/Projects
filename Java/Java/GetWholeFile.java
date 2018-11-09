import static java.lang.System.*;
import java.util.*;
import java.io.File;
public class GetWholeFile {
	public static void main(String[] args) throws Exception {
		int fourLetter = 0;
		int caps = 0;
		String fn1 = "";
		String fn2 = "";
		Scanner kb = new Scanner(System.in);

		out.print("What file would you like to see four-letter words in? ");
		fn1 = kb.nextLine();
		mySleep.sleep(1000);
		Scanner wordReader = new Scanner(new File(fn1));
		out.println("Showing four letter words in " + fn1);
		mySleep.sleep(1000);
		while (wordReader.hasNext()) {
			String w = wordReader.next();
			if (w.length() == 4) {
				fourLetter++;
				out.println(fourLetter + " " + w);
			}
		}
		wordReader.close();
		out.println();
		out.println(fourLetter + " four-letter words in " + fn1);

		out.println();
		out.print("\nAnd what file would you like to see words that start with capital letter? ");
		fn2 = kb.nextLine();
		mySleep.sleep(1000);
		out.println("Showing words that start with capital letters in " + fn2);
		mySleep.sleep(1000);
		Scanner selfInput = new Scanner(new File(fn2));
		while (selfInput.hasNext()) {
			String token = selfInput.next();
			if (Character.isUpperCase(token.charAt(0))) {
				caps++;
				out.println(caps + " " + token);
			}
		}
		selfInput.close();
		out.println();
		out.println(caps + " words start with capitals in " + fn2);
	}
}
