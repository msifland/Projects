public class ModulusAnimation {
	public static void main(String[] args) throws Exception {

		int repeats = 50;
		int steps_per_second = 10;

		for(int i = 0; i < (repeats * 9); i++) {
			if(i%9 == 0) {
				System.out.print("oOo......\r");
			}
			else if(i%9 == 1) {
				System.out.print("..oOo....\r");
			}
			else if(i%9 == 2) {
				System.out.print("...oOo...\r");
			}
			else if(i%9 == 3) {
				System.out.print("....oOo..\r");
			}
			else if(i%9 == 4) {
				System.out.print(".....oOo.\r");
			}
			else if(i%9 == 5) {
				System.out.print("......oOo\r");
			}
			else if(i%9 == 6) {
				System.out.print("o......oO\r");
			}
			else if(i%9 == 7) {
				System.out.print("Oo......o\r");
			}
			else if(i%9 == 8) {
				System.out.print("oOo......\r");
			}


			Thread.sleep(700/steps_per_second);
		}
	}
}