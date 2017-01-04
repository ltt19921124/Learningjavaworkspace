package constructor;

public class A {

	/**
	 * @param args
	 */
	/*函数的重载
	 * 1,两个或多个函数在同一个类中
	 * 2，函数名相同
	 * 3，参数列表不同
	 * 
	 */
	/*构造函数
	 *1， 函数名必须与类名相同
	 * 		如果没有定义构造函数，编译器会自动加一个无参数的构造函数
	 * 2,无返回值
	 */
	A(){
		System.out.println("我是构造函数");
	}
	/*
	void funA(){
		System.out.println("无参数构造函数");
	}
	void funA(int i){
		System.out.println("有一个参数的构造函数");
	}
	void funA(int i,double b){
		System.out.println("有两个参数的构造函数");
	}
	*/
}
