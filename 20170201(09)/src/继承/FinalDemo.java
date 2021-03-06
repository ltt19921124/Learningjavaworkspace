package 继承;
//继承的弊端：打破了封装性
/*
 * 1，final是一个修饰符，可以修饰类，方法，变量
 * 2，final修饰的类不可以被继承
 * 3,final修饰的方法不可以被覆盖
 * 4,final修饰的变量是一个常量，只能赋值一次，常量都是大写。
 * 
 * 常量书写规范：一般都用final修饰常量，这个常量的值不能再变化，而且取名字最好
 * 取有意义的，提高阅读性，写代码常量都应该用final固定常量。所有字母都大写，多个
 * 单词，中间用下划线连接。
 * 
 * */
class Fu1{
	void method(){
		//调用底层资源l
	}
}

class Zi1 extends Fu1{
	final static int x = 5;	final double PI = 3.14;
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
