package 抽象类;
//描述雇员
abstract class Employee{
	private String name;
	private String id;
	private double pay;
	
	Employee(String name,String id,double pay){
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	abstract void work();
}
//描述程序员
class Programmer extends Employee{
	Programmer(String name,String id,double pay){
		super(name,id,pay);
	}
	public void work(){
		System.out.println("code...");
	}
}
//描述经理
class Manager extends Employee{
	private int bonus;
	Manager(String name,String id,double pay,int bonus){
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work(){
		System.out.println("manager...");
	}
}
public class AbstractTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
