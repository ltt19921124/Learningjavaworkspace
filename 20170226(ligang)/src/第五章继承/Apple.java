package 第五章继承;

public class Apple extends Fruit {

	/**
	 * java中类与类之间是单继承，
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个Apple对象
		Apple a = new Apple();
		//从父类中获得了weight属性
		a.weight = 56;
		//调用info方法
		a.info();
	}

}
