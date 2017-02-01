package 继承;

/*
 * 子父类中构造函数的特点
 * 在子类构造对象时，发现访问子类构造函数时，父类的构造函数也运行了
 * 原因是：在子类的二狗子函数中第一行有一个默认的隐式语句，super().
 * 
 * */
class Fu{
	Fu(){
		System.out.println("fu run");
	}
}

class Zi extends Fu{
	Zi(){
		//super()//调用的是父类中的空参数的构造函数
		System.out.println("zi run");
	}
}

public class ExtendsDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Zi();
	}

}
