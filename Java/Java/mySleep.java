import java.lang.Thread.*;

/**
 * This is my own sleep function. Make sure mySleep.class file is in same directory as running class. Usage: mySleep.sleep(###);
 * @author	Michael Ifland
 * @param	mySleep(1000)	number is miliseconds
 **/
public class mySleep {
	public static void sleep(int slp) {
		try {
			Thread.sleep(slp);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
