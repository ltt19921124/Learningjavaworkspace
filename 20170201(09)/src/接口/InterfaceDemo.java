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
 class DemoImpl implements Demo{
	 public void show1(){
		 
	 }
	 public void show2(){
		 
	 }
 }
 
 class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoImpl d = new DemoImpl();
	}

}
