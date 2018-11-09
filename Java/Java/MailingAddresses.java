import static java.lang.System.*;
import java.util.*;
class Address {
	String street;
	String city;
	String state;
	int zip;
}

public class MailingAddresses {
	public static void main(String[] args) {
		Address uno, dos, tres;

		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city = "Miami";
		uno.state = "Florida";
		uno.zip = 33179;

		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city = "Crafton";
		dos.state = "PA";
		dos.zip = 15205;

		tres = new Address();
		tres.street = "2270 Woodland Heights";
		tres.city = "Cookeville";
		tres.state = "TN";
		tres.zip = 38501;

		out.println("\n" + uno.street + ", " +uno.city + ", " + uno.state + " " + uno.zip + "\n");
		out.println(dos.street + ", " + dos.city + ", " + dos.state + " " + dos.zip + "\n");
		out.println(tres.street + ", " + tres.city + ", " + tres.state + " " + tres.zip + "\n");
	}
}