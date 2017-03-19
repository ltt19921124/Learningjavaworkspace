package day09;


abstract class Employee{
	private String name;
	
	private String id;
	private double pay;
	Employee(String name,String id,double pay){
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	public abstract void work();
}

class Manager extends Employee{
	private int bonus;
	Manager(String name, String id, double pay,int bonus) {
		super(name, id, pay);
		this.bonus = bonus;
	}
	public void work(){
		System.out.println("manager");
	}
}

class AbstractTest {

	/**
	 * @param args
	 * ��Աʾ��
	 * 
	 */
	public static void main(String[] args) {

	}

}
