package Math;

import java.util.Date;

public class DataDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		
//		System.out.println(time);
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(1487398549100l);
		System.out.println(date2);
	}
}
