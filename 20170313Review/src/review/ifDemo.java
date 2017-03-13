package review;

public class ifDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1, b;
		/*
		if (a > 1) {
			b = 100;
		} else {
			b = 200;
		}
		System.out.println("b=" + b);
		*/
		/*
		b = a>1?100:200;//三元运算符
		当ifelse运算后，有一个具体的结果时，可以简化写成三元运算符。
		System.out.println("b=" + b);
		*/
		/*
		int x = 4;
		if(x > 1)
			System.out.println("a1");
		if(x > 2)
			System.out.println("a2");
		if(x > 3)
			System.out.println("a3");
//		else
//			System.out.println("a4");
		 */
 
		{
			//m的作用于只在花括号中
			int m = 89;
			System.out.println("over.." + m);
		}
//		System.out.println(m);
	}

}
