import static java.lang.System.*;
import java.util.*;

public class Dice {

	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(in);
		Random r = new Random();

		//int[] t = new int[100];
		int total = 0;
		int i = 0;
		int j = 0;

		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		int q = 0;
		int rr = 0;
		int s = 0;
		int t = 0;
		int u = 0;

		out.println("HERE COMES THE DICE");
		out.print("Home many rolls would you like? ");
		int rolls = kb.nextInt();

		for(i = 0; i < rolls; i++) {

			int roll1 = 1 + r.nextInt(6);
			int roll2 = 1 + r.nextInt(6);
			out.println("Die 1: " + roll1);
			out.println("Die 2: " + roll2);
			total = (roll1 + roll2);
			if(total == 2) {
			k++;
			}
			if(total == 3) {
			l++;
			}
			if(total == 4) {
			m++;
			}
			if(total == 5) {
			n++;
			}
			if(total == 6) {
			o++;
			}
			if(total == 7) {
			p++;
			}
			if(total == 8) {
			q++;
			}
			if(total == 9) {
			rr++;
			}
			if(total == 10) {
			s++;
			}
			if(total == 11) {
			t++;
			}
			if(total == 12) {
			u++;
			}
			out.println("Total: " + total);
			j = j + total;
			out.println();
			Thread.sleep(0);
		}

			out.println("Total of all rolls is: " + j);
			out.println("Two's:\t" + k);
			out.println("Three's:" + l);
			out.println("Four's:\t" + m);
			out.println("Five's:\t" + n);
			out.println("Six's:\t" + o);
			out.println("Seven's:" + p);
			out.println("Eight's:" + q);
			out.println("Nine's:\t" + rr);
			out.println("Ten's:\t" + s);
			out.println("Eleven's:" + t);
			out.println("Twelve's:" + u);
	}
}