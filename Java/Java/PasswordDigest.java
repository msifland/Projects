import java.security.MessageDigest;
import java.util.*;
import javax.xml.bind.DatatypeConverter;
import static java.lang.System.*;
public class PasswordDigest {
	public static void main(String[] args) throws Exception {
		Scanner keys = new Scanner(System.in);
		String pw, hash;

		MessageDigest digest = MessageDigest.getInstance("SHA-256");

		out.print("Password: ");
		pw = keys.nextLine();

		digest.update(pw.getBytes("UTF-8"));
		hash = DatatypeConverter.printHexBinary(digest.digest());

		out.println(hash);
	}
}
