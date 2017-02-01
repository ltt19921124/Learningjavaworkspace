/*
 * 抽象类
 * 抽象：笼统，模糊
 * 函数声明，函数体
 * */

package 抽象类;

abstract class Demo{
	abstract/*抽象*/ void show();
}

class DemoA extends Demo{
	void show(){
		System.out.println("demoa");
	}
}

class DemoB extends Demo{
	void show(){
		System.out.println("demob");
	}
}

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
