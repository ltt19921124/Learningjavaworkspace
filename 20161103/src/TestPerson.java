
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
//		p.age = 1000;
		p.setAge(1000);
		System.out.println("未能设置age属性时:" + p.getAge());
		p.setAge(30);
		p.setName("小小");
		System.out.println("成功设置name属性后:" + p.getName());
	}

}
