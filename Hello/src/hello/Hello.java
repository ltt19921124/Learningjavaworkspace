package hello;

import java.util.Scanner;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÄãºÃ");
		Scanner	in = new Scanner(System.in);
		final int amount = 100;
		int price = 0;
		price = in.nextInt();
//		System.out.println("echo:" + in.nextLine());
		System.out.println(amount+"-" +price+"="+ (amount - price));
		
	} 

}
