import static java.lang.System.*;
import java.util.*;
import java.net.URL;
public class LowestTemp {
	public static void main(String[] args) throws Exception {
		String urlbase = "https://learnjavathehardway.org/txt/";
		double[] temps = arrayFromUrl(urlbase + "avg-daily-temps-atx.txt");

		out.println(temps.length + " temperatures in database.");

		double lowest = 9999.99;

		for(int i = 0; i < temps.length; i++) {
			if(temps[i] < lowest) {
				lowest = temps[i];
			}
		}

		out.print("The lowest average daily temp was ");
		out.println(lowest + "F (" + fToC(lowest) + "C)");

		double highest = 0.00;

		for(int i = 0; i < temps.length; i++) {
			if(temps[i] > highest) {
				highest = temps[i];
			}
		}

		out.print("The highest average daily temp was ");
		out.println(highest + "F (" + fToC(highest) + "C)");
	}

	public static double[] arrayFromUrl(String url) throws Exception {
		Scanner fin = new Scanner((new URL(url)).openStream());

		int count = fin.nextInt();

		double[] dubs = new double[count];

		for(int i = 0; i < dubs.length; i++){
			dubs[i] = fin.nextDouble();
		}
		fin.close();

		return dubs;
	}

	public static double fToC(double f) {
		return (f - 32) * 5 / 9;
	}
}