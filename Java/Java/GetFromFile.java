import static java.lang.System.*;
import java.util.*;
import java.io.File;

public class GetFromFile {
	public static void main(String[] args) throws Exception {
		String name;
		int a, b, c, sum;
		out.println("Getting name and three numbers from file...");
		out.print("What is the file name you want to read from? ");
		Scanner keys = new Scanner(System.in);
		String myFile = keys.nextLine();
		mySleep.sleep(1000);

		Scanner fileIn = new Scanner(new File(myFile));
			name = fileIn.nextLine();
			a = fileIn.nextInt();
			b = fileIn.nextInt();
			c = fileIn.nextInt();

		fileIn.close();
		mySleep.sleep(1000);
		out.println("Done.");
		out.println("Your name is " + name);
		mySleep.sleep(1000);
		sum = (a + b + c);
		out.println(a + "+" + b + "+" + c + "=" + sum);
	}
}
