import static java.lang.System.*;
import java.io.PrintWriter;
public class ReceiptRevisited {
	public static void main(String[] args) throws Exception {
		PrintWriter fileout = new PrintWriter("receipt.txt");

		fileout.println("+------------------------+");
		fileout.println("|                        |");
		fileout.println("|     Corner Store       |");
		fileout.println("|                        |");
		fileout.println("|  07-19-2016   8:12PM   |");
		fileout.println("|  Gallons:     12.464   |");
		fileout.println("|  Price/Gal:   $2.159   |");
		fileout.println("|                        |");
		fileout.println("|  Fuel Total: $ 43.23   |");
		fileout.println("|                        |");
		fileout.println("+------------------------+");
		fileout.close();
	}
}
