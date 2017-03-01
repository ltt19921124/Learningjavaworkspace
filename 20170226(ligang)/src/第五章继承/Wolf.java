package 第五章继承;

class Creature {

	public Creature(){
		System.out.println("Create 无参构造器");
	}

}

class Animal extends Creature{
//	public String name;
//	public int age;
	
	public Animal(String name){
		System.out.println("Animal带一个参数的构造器，name为：" + name);
	}
	
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal带两个参数的构造器，age为：" + age);
	}
}

class Wolf extends Animal{
	
	public Wolf(){
		super("狼",3);
		System.out.println("wolf无参的构造器");
	}
	public static void main(String[] args){
		new Wolf();
	}
}





