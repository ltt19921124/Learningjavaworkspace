package 第五章面向对象;

public class ConstructorOverload {

	/**
	 * @param args
	 */
	public String name;
	public int count;
	//提供无参数的的构造器
	public ConstructorOverload(){
		
	}
	//提供有两个参数的构造器，对该构造器返回的对象进行 初始化
	public ConstructorOverload(String name,int count){
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args) {
		//通过无参数的构造器创建ConstructorOverload对象
		ConstructorOverload oc1 = new ConstructorOverload();
		//通过有两个参数的构造器创建ConstructorOverload对象
		ConstructorOverload oc2 = new ConstructorOverload("轻量级J2EE企业应用",
				18000);
		System.out.println(oc1.name);
		System.out.println(oc2.name);
	}

}







