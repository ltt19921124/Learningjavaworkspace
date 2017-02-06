package object类;

class Person {
	private int age;

	Person(int age) {
		this.age = age;
	}
	//比较的是Person年龄是否是同龄人
	public boolean equals(Object obj){
		if(!(obj instanceof Person)){
//			return false;
			throw new ClassCastException("类型错误");
		}
		Person p =(Person)obj;
		return this.age == p.age;
	}
//	public int hashCode(){
//		return age;
//	}
	public String toString(){
		return "Person:" + age;
	}
}

public class ObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person(20);
		Person p2 = new Person(20);
//		Person p3 = p1;
//		System.out.println(p1 == p2);//false
//		System.out.println(p1.equals(p2));//false
		System.out.println(p1);//366712642
		System.out.println(p1.getClass().getName()+"@"+Integer.toHexString(p1.hashCode()));
//		System.out.println(Integer.toHexString(p2.hashCode()));//366712642
	}

}
