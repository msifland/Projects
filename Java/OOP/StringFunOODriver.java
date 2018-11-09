import static java.lang.System.*;
import java.util.Scanner;
public class StringFunOODriver {
	public static void main( String[] args ) {
		Scanner kb = new Scanner(System.in);

		// Input it
		out.print("Enter a message: ");
		String msg = kb.nextLine();

		StringFunObject sfo = new StringFunObject();
		sfo.setMessage(msg);
		sfo.reverse();
		sfo.camelCase();

		StringFunObject sfo1 = new StringFunObject();
		sfo1.setMessage(msg);
		sfo1.deleteHalf();

		// Display it
		out.println( sfo.getMessage() );
		out.println( sfo1.getMessage() );
	}
}