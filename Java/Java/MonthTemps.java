import static java.lang.System.*;
import java.util.*;
import java.lang.Thread.*;
class TemperatureSample {
	int month, day, year;
	double temperature;
}

public class MonthTemps {

	public static double roundToOneDecimal(double d) {
		return Math.round(d * 100) / 100.00;
	}

	public static void sleep(int slp) {
		try {
			Thread.sleep(slp);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) throws Exception {
		String site = "http://academic.udayton.edu/kissock/http/Weather/gsod95-current/TNNASHVI.txt";
		Scanner inFile = new Scanner((new java.net.URL(site)).openStream());

		TemperatureSample[] tempDB = new TemperatureSample[50000];
		int numRecords, i = 0;

		while (inFile.hasNextInt() && i < tempDB.length) {
			TemperatureSample e = new TemperatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();
			if (e.temperature == -99) {
				continue;
			}
			tempDB[i] = e;
			i++;
		}
		inFile.close();
		numRecords = i;

		out.println();
		out.println(numRecords + " daily temperatures loaded.\n");
		sleep(1500);

		// Get name and numer of current month
		Calendar mCalendar = Calendar.getInstance();
		Calendar calNum = Calendar.getInstance();
		String month = mCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		int monthNum = calNum.get(Calendar.MONTH);

		double lowest = 9999.99;
		double highest = 0;
		double total = 0, avg;
		int count = 0;
		for (i = 0; i < numRecords; i++) {
			if(tempDB[i].month == monthNum) {
				total += tempDB[i].temperature;
				count++;
				if(tempDB[i].temperature < lowest) {
					lowest = tempDB[i].temperature;
				}
				if(tempDB[i].temperature > highest) {
					highest = tempDB[i].temperature;
				}
			}
		}

		avg = (total / count);
		avg = roundToOneDecimal(avg);
		out.print("Average daily temperature over " + count);
		out.println(" days in " + month + " is " + avg + "\n");
		sleep(1500);
		out.println("The lowest average daily temp for " + month + " was " + lowest + "\n");
		sleep(1500);
		out.println("The highest average daily temp for " + month + " was " + highest + "\n");
		sleep(500);
	}
}