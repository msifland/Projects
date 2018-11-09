import static java.lang.System.*;
import java.util.*;
class Actor {
	String name;
	String role;
	String birthdate;
}

public class ActorList {
	public static void main(String[] args) throws Exception {
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";

		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());

		while (inFile.hasNext()) {
			Actor a = getActor(inFile);
			out.print(a.name + " was born on " + a.birthdate);
			out.println(" and played " + a.role);
		}
		inFile.close();
	}

	public static Actor getActor(Scanner input) {
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();

		return a;
	}
}