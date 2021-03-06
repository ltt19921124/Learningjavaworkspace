package 多态;

abstract class Animal{
	abstract void eat();
}

class Dog extends Animal{
	void eat(){
		System.out.println("啃骨头");
	}
	void lookHome(){
		System.out.println("看家");
	}
}

class Cat extends Animal{
	void eat(){
		System.out.println("吃鱼");
	}
	void catchMouse(){
		System.out.println("抓老鼠");
	}
}
class Pig extends Animal{
	void eat(){
		System.out.println("吃饲料");
	}
	void gongDi(){
		System.out.println("拱地");
	}
}

public class DuoTaiDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();
		Animal a = new Cat();//向上转型，自动类型提升
		//猫一旦提升了类型，就出现了访问限制，就不能访问猫特有功能了
		//上溯造型，作用是限制对特有功能的访问。
		//如果还想用具体动猫的特有功能，可以将该对象进行向下转型
		Cat c = (Cat) a;//向下转型
		/*
		 * 向下转型的目的是为了使用子类的特有功能
		 * 对于转型，至始至终都是子类对象在做着类型的变化
		 * */
//		c.eat();
//		c.catchMouse();
		method(new Dog());
		
		
//		Dog d = new Dog();
//		method(c);//多态，只要是动物的子类就可以
		
//		c.eat();//打印吃鱼
//		method(c);//打印吃鱼
	}
	public static void method(Animal a){//Anima a = new Dog()
		a.eat();
		if(a instanceof Cat){//用于判断对象的具体类型
			//通常在向下转型前用于健壮性的判断
			Cat c = (Cat)a;
			c.catchMouse();
		}else if(a instanceof Dog){
			Dog d = (Dog)a;
			d.lookHome();
		}
	}
//	public static void method(Cat c){
//		c.eat();
//	}
//	public static void method(Dog d){
//		d.eat();
//	}
}





