
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d = new Dog();//
		Dog d2 = new Dog();
		d.name = "旺财";
		d.age = 2;
		d.color = "黑色";
		d2.name = "四喜";
		
		d.jump();
		d2.jump();
		//匿名对象的使用
		new Dog().jump();
		System.out.println("名字是：" + d.name);
	}

}
