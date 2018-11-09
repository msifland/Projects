import static java.lang.System.*;

public class TVActorDriver {
	public static void main( String[] args ) {
		TVActor a = new TVActor();
		a.name = "Thomas Middleitch";
		a.role = "Richard Hendricks";
		a.age = 32;

		TVActor b = new TVActor();
		b.name = "Martin Starr";
		b.role = "Bertram Gilfoule";
		b.age = 45;

		TVActor c = new TVActor();
		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtal";
		c.age = 78;

		out.println( a.name + " played " + a.role + " and was " + a.age + " years old.");
		out.println( b.name + " played " + b.role + " and was " + b.age + " years old.");
		out.println( c.name + " played " + c.role + " and was " + c.age + " years old.");
	}
}