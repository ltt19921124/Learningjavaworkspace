package 第五章继承;

public class Sub extends Base {

	/**
	 * @param args
	 * 
	 */
	public String color;
	public Sub(double size,String name,String color){
		super(size,color);
		this.color = color;
	}
	
	public static void main(String[] args){
		Sub s = new Sub(5.6,"测试对象","红色");
		System.out.println(s.size + "-" + s.name + "-" + s.color);
	}

}
