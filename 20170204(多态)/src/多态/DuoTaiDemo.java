package ��̬;

abstract class Animal{
	abstract void eat();
}

class Dog extends Animal{
	void eat(){
		System.out.println("�й�ͷ");
	}
	void lookHome(){
		System.out.println("����");
	}
}

class Cat extends Animal{
	void eat(){
		System.out.println("����");
	}
	void catchMouse(){
		System.out.println("ץ����");
	}
}

public class DuoTaiDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		
//		c.eat();//��ӡ����
		method(c);//��ӡ����
	}
	public static void method(Cat c){
		c.eat();
	}
	public static void method(Dog d){
		
	}
}





