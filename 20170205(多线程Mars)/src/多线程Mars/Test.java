package 多线程Mars;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 * 判断几位数
	 */
	public static void main(String[] args) {
		System.out.print("输入一个数:");
		Scanner in = new Scanner(System.in);
		int count = 0;
		int number = in.nextInt();
		int y = number;
		in.close();
//		while (number > 0) {
//			number /= 10;
//			count++;
//		}
//		in.close();
//		System.out.println(y + "是" +"位数");
	}

}
