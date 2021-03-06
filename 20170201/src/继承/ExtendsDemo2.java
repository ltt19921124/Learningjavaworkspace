package 继承;

/*
 * 
 * 在子父类中，成员的特点
 * 1，成员变量
 * 		当本类中的成员变量和局部变量同名用this区分
 * 		当子父类中的成员变量同名用super区分父类
 * 		this和super的用法很相似
 * 		
 * 		this:代表一个本类对象的引用
 * 		super:代表一个父类的空间
 * 
 * 2，成员函数
 * 		当子父类中出现成员函数一模一样的情况，会运行子类的函数
 * 		这种情况，称为覆盖操作，这是函数在子父类中的特性
 * 		函数两个特性：
 * 			1，重载，同一个类中，overload
 * 			2，覆盖:子类中，覆盖也称为重写，复写，override		
 * 		覆盖注意事项：
 * 			1，子类覆盖父类方法时，必须要大于等于父类权限才可以进行覆盖
 * 			2，静态只能覆盖静态，或被静态覆盖
 * 		什么时候使用覆盖操作？
 * 		当对一个类进行子类的扩展时，子类需要保留父类的功能申明
 * 		但是要定义子类中该功能的特有内容时，就使用覆盖操作来完成。
 * 			
 * 		
 * 		
 * 3，构造函数
 * 
 * 
 * */
//1，成员变量
class Fu {
	int num = 4;
}

class Zi extends Fu {
	int num = 5;

	void show() {//super代表一个父类空间
		System.out.println(this.num + "..." + super.num);
	}
}

public class ExtendsDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();// 5...5
	}

}
