package 第五章面向对象;

public class Overload {

	/**
	 * @param args
	 */
	//函数的重载，函数名相同，参数列表不同。
	public void test(){
		System.out.println("无参数");
	}
	public void test(String msg){
		System.out.println("重载的test方法" + msg);
	}
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.test();
		ol.test("hello");
	}

}
