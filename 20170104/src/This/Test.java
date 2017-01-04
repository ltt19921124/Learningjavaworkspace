package This;

public class Test {

	/**
	 * @param args
	 * this:代表调用哪个函数的对象
	 * 
	 */
	public static void main(String[] args) {
		Person p1 = new Person("张三",13,"北京");
		p1.name = "张三";
		
		Person p2 = new Person("李四",15,"赣州");
		p2.name = "李四";
		
		p1.talk("张三1");
//		p2.talk();
	}

}
