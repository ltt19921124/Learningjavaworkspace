
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d = new Dog();//
		Dog d2 = new Dog();
		d.name = "����";
		d.age = 2;
		d.color = "��ɫ";
		d2.name = "��ϲ";
		
		d.jump();
		d2.jump();
		//���������ʹ��
		new Dog().jump();
		System.out.println("�����ǣ�" + d.name);
	}

}