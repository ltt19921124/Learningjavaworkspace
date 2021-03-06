package 继承;

/*
 * 子父类中构造函数的特点
 * 在子类构造对象时，发现访问子类构造函数时，父类的构造函数也运行了
 * 原因是：在子类的构造函数中第一行有一个默认的隐式语句，super().
 * 
 * 子类的实例化过程，子类中所有的构造函数默认都会访问父类中的空参数构造函数。
 * 
 * 为什么子类实例化的时候要访问父类中的构造函数呢？
 * 那是因为子类继承了父类，获取到了父类中的内容，所以
 * 在使用父类内容之前要先看父类是如何对自己的内容进行初始化的。
 * 
 * 所以子类在构造对象时，必须要访问父类中的构造函数。
 * 为了完成这个必须的工作，就在子类的构造函数中加入super()语句，
 * 
 * 如果父类中没有定义空参数构造函数，哪么子类中的构造函数必须用super明确
 * 要调用父类中的哪个函数。
 * super和this都只能有一个但是可以保证的是子类中肯定有其他的构造函数会调用
 * 父类的构造函数。
 * 
 * 注意：super语句必须要定义在子类构造函数的第一行，因为父类的初始化要先完成
 * 
 * 
 * 
 * 
 * 
 * 
 * */
class Fu{
	Fu(){
		System.out.println("A fu run");
	}
	Fu(int x){
		System.out.println("B fu run..." + x);
	}
}

class Zi extends Fu{
	Zi(){
		//super()//调用的是父类中的空参数的构造函数
		super(3);
		System.out.println("C zi run");
	}
	Zi(int x){
		//super()
		System.out.println("D zi run" + x);
	}
}

public class ExtendsDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Zi(6);//
	}

}
