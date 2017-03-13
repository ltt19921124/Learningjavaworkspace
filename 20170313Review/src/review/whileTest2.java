package review;

public class whileTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1;
		int count = 0;
		while(x <= 100){
			if(x % 6 == 0){
				count++;
				System.out.println("x=" + x);
				x++;
			}
		}
		System.out.println("count=" + count);
	}

}
