package 第五章面向对象;

public class Apple {

	/**
	 * @param args
	 */
	public String name;
	public String color;
	public double weight;
	//无参的构造器
	public Apple(){
		
	}
	//两个参数的构造器
	public Apple(String name,String color){
		this.name = name;
		this.color = color;
	}
	//三个构造器的构造函数
	public Apple(String name,String color,double weight){
		this(name,color);
		this.weight = weight;
	}
}
