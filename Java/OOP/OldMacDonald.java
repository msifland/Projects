import static java.lang.System.*;
import java.util.*;

class Cow {
	public void moo() {
		out.println("Cow says moo.");
	}
}

class Pig {
	public void oink() {
		out.println("Pig says oink.");
	}
}

class Duck {
	public void quack() {
		out.println("Duck says quack.");
	}
}

class Fox {
	public void fox_say() {
		out.println("Ring ding ding ding dinga dinga ding!!!");
	}
}

public class OldMacDonald {
	public static void main( String[] args ) throws Exception {

		Cow maudine = new Cow();
		Cow pauline = new Cow();
		maudine.moo();
		pauline.moo();

		Pig snowball = new Pig();
		snowball.oink();
		snowball.oink();

		Duck ferdinand = new Duck();
		ferdinand.quack();

		Fox fox = new Fox();
		out.println("\nAnd.....\nWHAT THE FOX SAY....\n");
		Thread.sleep(1000);
		fox.fox_say();
	}
}