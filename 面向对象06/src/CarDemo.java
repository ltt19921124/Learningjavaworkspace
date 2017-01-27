
//描述汽车
class Car{
	int num;
	String color;//String不是关键字
	
	void run(){
		System.out.println(num+"...."+color);
	}
}


public class CarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 描述小汽车
		 * 分析：
		 * 	1,属性
		 * 		轮胎数，颜色
		 * 	2,行为
		 * 		运行
		 * 定义类就是在定义类中的成员。
		 * 成员变量对应属性，成员函数对应事物中的行为。
		 * 局部变量只在方法中有效。
		 * Car这个类没有主函数，因为它没必要独立运行。所以不写主函数。
		 * 
		 * 
		 * */
		//创建Car实例
		Car c = new Car();//c是一个类类型的引用变量，指向了该类的对象
		c.num = 4;
		c.color = "red";
		c.run();//使用对象中的内容，可以通过对象.成员方式来完成调用。
		
	}

}
