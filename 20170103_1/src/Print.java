
public class Print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int z = 4;
		for (int i = 0; i < z; i++) {
			for (int k = 0; k < z -i-1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
