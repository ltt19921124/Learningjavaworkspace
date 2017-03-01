package 第五章面向对象;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person2 p = new Person2();
//		p.age = 20;
		p.setAge(1000);
		System.out.println("未能设置age属性时：" + p.getAge());
		p.setAge(30);
		System.out.println("成功设置age属性时：" + p.getAge());
		p.setName("李刚");
		System.out.println("成功设置name属性时：" + p.getName());
		
		/*
		 * javac -d . hello.java
		 * */
	}

}
