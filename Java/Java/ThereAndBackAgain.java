import static java.lang.System.*;
public class ThereAndBackAgain {
	public static void main(String[] args) {
		out.println("Here.");
		erebor();
		out.println("Back first time.");
		erebor();
		out.println("Back second time.");
	}

	public static void erebor() {
		out.println("There.");
	}
}
