package demo;

public class TestTriangle {

	/**
	 * @param args
	 * 打印出星号三角形
	 * 四行，第一行一个，以此类推，图形是个三角形
	 * 
	 */
	public static void main(String[] args) {
		int z = 4;
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z-1 -i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
