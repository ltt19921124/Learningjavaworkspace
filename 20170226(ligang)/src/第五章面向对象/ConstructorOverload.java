package �������������;

public class ConstructorOverload {

	/**
	 * @param args
	 */
	public String name;
	public int count;
	//�ṩ�޲����ĵĹ�����
	public ConstructorOverload(){
		
	}
	//�ṩ�����������Ĺ��������Ըù��������صĶ������ ��ʼ��
	public ConstructorOverload(String name,int count){
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args) {
		//ͨ���޲����Ĺ���������ConstructorOverload����
		ConstructorOverload oc1 = new ConstructorOverload();
		//ͨ�������������Ĺ���������ConstructorOverload����
		ConstructorOverload oc2 = new ConstructorOverload("������J2EE��ҵӦ��",
				18000);
		System.out.println(oc1.name);
		System.out.println(oc2.name);
	}

}







