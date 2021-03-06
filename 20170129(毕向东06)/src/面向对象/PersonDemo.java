/*
 * 封装代码示例。
 * 
 * 封装是隐藏了实现细节，对外提供访问方式，把age隐藏了，
 * 
 * 描述人：
 * 1，年龄
 * 2，说话
 * 
 * 私有：
 * 		1，是一个权限修饰符，用于修饰成员
 * 		2，私有的内容只在本类中有效
 * 注意：私有仅仅是封装的一种体现形式而已，为了对数据可控。
 * 
 * 笔记本就是一个封装体，java中的类是封装体，函数是最小的封装体。 框架也是封装体。
 * 
 * */
package 面向对象;

class Person {

	private/* 私有 */int age;// 只在本类中有效，外界不能访问
	private String name;
	
	/*Person(){
		name = "baby";
		age = 1;
		System.out.println("person run");
	}*/
	
	Person(String name){
		/*当成员变量和局部变量重名，可以用this来区分。
		 * 
		 * this就代表对象，代表哪个对象？(当前对象)
		 * this就是所在函数所属对象的引用。
		 * 简单说，哪个对象调用了this所在的函数，this就代表哪个对象。
		 * this是一个引用。
		 */
		this.name = name;//this
//		System.out.println("name:" + name);
	}
	
	public void setName(String n){
		name = n;
	}
	
	/*public void setAge(int a) {//设置值，获取值,规范
		if (a > 0 && a < 130)
			age = a;
		else
			System.out.println("错误的数据。");
	}*/
	
	/*public int getAge(){
		return age;
	}*/

	void speak() {
		System.out.println("age=" + age+",name:"+name);
	}
}

public class PersonDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
//		Person p = new Person();
		// p.age = -20;//这样会出问题。年龄不会有负数。这里就不符合常识。有安全隐患
		Person p1 = new Person("旺财");
//		p1.setName("小强");
		p1.speak();
		Person p2 = new Person("小强");
		p2.speak();
//		p.setAge(-20);
//		p.speak();
	}

}
