package 内部类;

/*
 * 内部类访问特点“
 * 1，内部类可以直接访问外部类中的成员
 * 2，外部类要访问内部类，必须建立内部类的对象
 * 
 * 一般用于类的设计
 * 分析事物时，发现该事物中还有事物，而且这个事物还在访问被描述事物的内容
 * 这时就把还有的事物定义成内部类来描述
 * */
class Outer{
	class Inner{//内部类
		void show(){
			System.out.println("show run");
		}
	}
}

class OuterDemo{
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
