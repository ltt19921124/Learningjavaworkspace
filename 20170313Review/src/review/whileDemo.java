package review;

public class whileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int x = 1;
		while(x < 3){
			System.out.println("x=" + x);
			x++;
		}
		*/
		/*
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		int x = 0,sum = 0;
		while(x < 101){
			sum = sum + x;
			x++;
		}
		System.out.println(sum);
	}

}
