
//描述汽车
class Car{
	int num = 4;
	String color;//String不是关键字
	
	void run(){
		int num = 10;//打印出10
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
		 * 成员变量和局部变量的区别
		 * 
		 * 1，成员变量定义在类中，整个类中可以访问，
		 * 局部变量定义在函数语句局部代码块中，只在所属的区域有效
		 * 
		 * 2，成员变量存在堆内存对象中，局部变量存在栈内存方法中，
		 * 
		 * 3，成员变量随着对象的创建而存在，随着对象的消失而消失
		 * 局部变量随着所属区域的存在而存在，随着所属区域的消失而消失
		 * 
		 * 4，成员变量有默认初始化值，局部变量没有默认初始化值。
		 * 
		 * 
		 *匿名对象，没有名字的对象
		 *new Car();匿名对象，其实就是定义对象的简写形式
		 * 	
		 * new Car().run();
		 * 1,当对象方法仅进行一次调用的时候，就可以简化成匿名对象。
		 * 
		 * 
		 * 	
		 * 
		 * */
		//创建Car实例
//		Car c = new Car();//c是一个类类型的引用变量，指向了该类的对象
//		c.num = 4;
//		c.color = "red";
//		c.run();//使用对象中的内容，可以通过对象.成员方式来完成调用。
		Car c1 = new Car();
		Car c2 = new Car();
		c1.num = 4;
		c1.color = "red";
		
//		Car c2 = new Car();
//		c2.num = 4;
//		c2.color = "red";
		
		show(c1);
		show(c2);
	}
	public static void show(Car c){//类类型的变量一定指向对象，要么就是空
		c.num = 3;
		c.color = "black";
	}
}
