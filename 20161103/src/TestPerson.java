
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
//		p.age = 1000;
		p.setAge(1000);
		System.out.println("δ������age����ʱ:" + p.getAge());
		p.setAge(30);
		p.setName("СС");
		System.out.println("�ɹ�����name���Ժ�:" + p.getName());
	}

}
