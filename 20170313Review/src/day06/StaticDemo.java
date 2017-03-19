package day06;

class Person_2{
	String name;
	static String country = "CN";
	public void show(){
		System.out.println(Person_2.country + ":" +this.name);
	}
}

class StaticDemo {
	int num = 4;
	/**
	 * @param args
	 * 静态代码块：用于给类进行初始化
	 */
	public static void main(String[] args) {
		Person_2 p = new Person_2();
		p.name = "小强";
		p.show();
		System.out.println(p.country);
		System.out.println(Person_2.country);
//		Person.show();
//		new StaticDemo.show();
		
	}
	public void show(){
		System.out.println(num);
	}

}





