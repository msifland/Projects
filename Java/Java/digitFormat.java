/**
 *  Formats doubles into chosen amount of decimal places
 * @author	Michael Ifland
 * @params	digitFormat.frmt("places", double)
 **/
public class digitFormat {
	public static String frmt(String places, double num) {
		String decimals = (String.format("%."+places+"f", num));
		return decimals;
	}
}
