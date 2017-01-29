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
	
	public void setAge(int a) {//设置值，获取值,规范
		if (a > 0 && a < 130)
			age = a;
		else
			System.out.println("错误的数据。");
	}
	
	public int getAge(){
		return age;
	}

	void speak() {
		System.out.println("age=" + age);
	}
}

public class PersonDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Person p = new Person();
		// p.age = -20;//这样会出问题。年龄不会有负数。这里就不符合常识。有安全隐患
		p.setAge(-20);
		p.speak();
	}

}
