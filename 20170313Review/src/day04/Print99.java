package day04;

public class Print99 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int x = 1;x < 10;x++){
			for(int y = 1;y <= x;y++){
				System.out.print(y + "*" + x + "=" + x*y + "\t");
			}
			System.out.println("");
		}
	}

}
