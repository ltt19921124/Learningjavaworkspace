package 第五章继承;

public class Ostrich extends Bird {

	/**
	 * @param args
	 * 覆盖，子类重写了父类的方法，覆盖时子类的访问权限要大于等于
	 * 父类的。
	 */
	
	public void fly(){
		System.out.println("跑");
	}
	
	public void callOverrideMethod(){
		//在子类中通过super关键字显式调用父类被覆盖的方法。
		super.fly();
	}
	
	public static void main(String[] args) {
		Ostrich os = new Ostrich();
		os.fly();//调用子类的方法
		os.callOverrideMethod();
	}

}
