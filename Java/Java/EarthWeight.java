import static java.lang.System.*;
import java.util.*;

class planetWeight {
	double venus = 0.78, mars = 0.39, jupiter = 2.65, saturn = 1.17, uranus = 1.05, neptune = 1.23;
}

public class EarthWeight {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean t = false;

		out.print("\nWhat is your Earch Weight in punds? ");
		int weight = kb.nextInt();
		String whichp = "";
		planetWeight p = new planetWeight();
		double conversion = 0;
		int which = 0;

		out.println("\nI have information for you about the following planets:\n1. Venus\t2. Mars\t\t3. Jupiter\n4. Saturn\t5. Uranus\t6. Neptune");

		while(which <=6) {
			out.print("\n\nWhich planet are you trying to visit? ");
			which = kb.nextInt();

			if(which == 1) {
				conversion = (p.venus * weight);
				whichp = "Venus";
				break;
			}
			else if(which == 2) {
				conversion = (p.mars * weight);
				whichp = "Mars";
				break;
			}
			else if(which == 3) {
				conversion = (p.jupiter * weight);
				whichp = "Jupiter";
				break;
			}
			else if(which == 4) {
				conversion = (p.saturn * weight);
				whichp = "Saturn";
				break;
			}
			else if(which == 5) {
				conversion = (p.uranus * weight);
				whichp = "Uranus";
				break;
			}
			else if(which == 6) {
				conversion = (p.neptune * weight);
				whichp = "Neptune";
				break;
			}
			else {
				out.println("I don't recognize that selection, try again...");
			}
		}

		out.println("\nYour weight would be " + conversion + " on " + whichp);
	}
}




