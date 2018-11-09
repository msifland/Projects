import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This class file allows executing of linux shell commands
 * @author	Michael Ifland
 * @param	shellCmd.shell("command to run")
 **/
public class shellCmd{
	public static void shell( String cmd ) {

		String s;
		Process p;

        try {
            p = Runtime.getRuntime().exec(cmd);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println(s);
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
	}
}