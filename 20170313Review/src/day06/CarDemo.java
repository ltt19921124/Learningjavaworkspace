package day06;

class Car {
	int num;
	String color;
	
	void run(){
		System.out.println(num + "..." + color);
	}
	
}

class CarDemo{
	public static void main(String[] args){
//		Car c = new Car();
//		c.num = 4;
//		c.color = "red";
//		c.run();
		Car c = new Car();
		show(c);
	}
	public static void show(Car c){
		c.num = 3;
		c.color = "black";
		System.out.println(c.color + "..." + c.num);
	}
}