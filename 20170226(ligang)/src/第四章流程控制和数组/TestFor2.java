package 第四章流程控制和数组;

public class TestFor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p++) {
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}

}
