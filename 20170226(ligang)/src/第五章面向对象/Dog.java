package �������������;

public class Dog {

	//����һ��jump����
	public void jump(){
		System.out.println("��ִ��jump����");
	}
	//����һ��run������run������Ҫ����jump����
	public void run(){
		Dog d = new Dog();
		d.jump();
		System.out.println("����ִ��run����");
	}
}
