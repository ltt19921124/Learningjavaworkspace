package 第五章面向对象;

public class Dog {

	//定义一个jump方法
	public void jump(){
		System.out.println("在执行jump方法");
	}
	//定义一个run方法，run方法需要借助jump方法
	public void run(){
		Dog d = new Dog();
		d.jump();
		System.out.println("正在执行run方法");
	}
}
