package 继承;

/*
 * 
 * 在子父类中，成员的特点
 * 1，成员变量
 * 		当本类中的成员变量和局部变量同名用this区分
 * 		当子父类中的成员变量同名用super区分
 * 		this和super的用法很相似
 * 		
 * 		this:代表一个本类对象的引用
 * 		super:代表一个父类的空间
 * 
 * 2，成员函数
 * 3，构造函数
 * 
 * */
//1，成员变量
class Fu {
	int num = 4;
}

class Zi extends Fu {
	int num = 5;

	void show() {
		System.out.println(this.num + "..." + super.num);
	}
}

public class ExtendsDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();// 5...5
	}

}
