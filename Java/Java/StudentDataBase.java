import static java.lang.System.*;
import java.util.*;
class Student {
	String name;
	int credits;
	double gpa;
}
public class StudentDataBase {
	public static void main(String[] args) {
		Student[] db;
		db = new Student[4];

		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;

		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;

		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;

		for(int i = 0; i < db.length; i++) {
			out.println("Name:\t\t" + db[i].name);
			out.println("Credit hours:\t" + db[i].credits);
			out.println("GPA:\t\t" + db[i].gpa);
		}

		int maxLoc = 0;

		for(int i = 1; i < db.length; i++) {
			if(db[i].gpa > db[maxLoc].gpa) {
				maxLoc = 1;
			}
		}
		out.println(db[maxLoc].name + " has the highest GPA.");
	}
}