package �߳�;

public class Print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int z = 7;
		for (int i = 0; i < z; i++) {
//			int k = i;
			for (int j = 0; j < z - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}