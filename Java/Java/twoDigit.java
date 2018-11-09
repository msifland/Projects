/**
 *  Formats doubles into 2 decimal places max
 * @author	Michael Ifland
 * @params	twoDigit.frmt("places", double)
 **/
public class twoDigit {
	public static String frmt(String places, double num) {
		String decimals = (String.format("%."+places+"f", num));
		return decimals;
	}
}
