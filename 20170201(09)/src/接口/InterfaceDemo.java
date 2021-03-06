package 接口;
/*
 * 当抽象类中的方法都是抽象的时候，这时就可以将该抽象类以
 * 另一种方式定义和表示，就是 接口 interface
 * 
 * 定义接口的方式关键字不是 class,而是 interface
 * 
 * 接口中常见的成员，而且他们都有固定的修饰符
 * 1，全局常量:public static final
 * 2，抽象方法:public static abstract
 * 
 * 
 * 由此得出结论：接口中的成员都是公共的，都是权限最大的
 * 
 * */
 interface Demo{
	public static final int NUM = 4;
	
	public abstract void show1();
	public abstract void show2();
}

 //类与接口之间是实现关系
 //接口不能实例化，只能有实现了接口的子类并覆盖了接口中所有的抽象方法后
 //该子类才可以实例化，否则，这个类还是一个抽象类
 class DemoImpl implements Demo{//类与接口之间是实现关系
	 public void show1(){
		 
	 }
	 public void show2(){
		 
	 }
 }
 
 class Q{
	 public void method(){
		 
	 }
 }
 
 interface A{
	 
 }
 /*
  * 再java中不直接支持多继承，因为会出现调用的不确定性
  * 在java中进行了改良，变成了多实现
  * 一个类可以实现多个接口
  * 
  * 抽象类与接口的异同点
  * 	相同点：都是不断向上抽取共性内容而来
  * 
  * 	不同点：
  * 		1，抽象类需要被继承，而且只能单继承
  * 			接口需要被实现，而且可以多实现
  * 		2，抽象类中可以定义抽象方法和非抽象方法，子类继承后
  * 			可以直接使用非抽象方法，接口中只能定义抽象方法，
  * 			必须被子类实现。
  * 		3，抽象类的继承，是 is a关系，在定义该体系的共性内容
  * 			接口的实现时like a关系，在定义体系饿额外功能。
  * 
  * 
  * */
 
 class Test2 extends Q implements A{
	 
 }
 class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoImpl d = new DemoImpl();
	}

}

 
 
 