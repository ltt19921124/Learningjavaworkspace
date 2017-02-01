package 继承;
//继承的弊端：打破了封装性
/*
 * 1，final是一个修饰符，可以修饰类，方法，变量
 * 2，final修饰的类不可以被继承
 * 3,final修饰的方法不可以被覆盖
 * 4,final修饰的变量是一个常量，只能赋值一次，常量都是大写
 * 
 * 
 * */
class Fu1{
	void method(){
		//调用底层资源l
	}
}

class Zi1 extends Fu1{
	final double PI = 3.14;
	void method(){
		final int number = 9;
//		System.out.println("haha");
	}
}

public class FinalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello world");
	}

}
