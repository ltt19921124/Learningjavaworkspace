package 第四章流程控制和数组;

public class TestDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int count = 1;
//		do{
//			System.out.println(count);
//			count++;
//		}
//		while(count < 10);
//		System.out.println("循环结束");
		
		int count2 = 20;
		//do while循环一定会先执行一次
		do{
			System.out.println(count2++);
		}
		while(count2 < 10);
		System.out.println("循环结束");
	}

}
