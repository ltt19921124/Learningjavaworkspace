package DuoTai;

/*
if(a instanceof Cat ){
	Cat c = (Cat)a;
	c.catchMouse();
}
ͨ��������ת��ǰ���ڽ�׳���ж�
*/

class ����ү{
	void ����(){
		System.out.println("����");
	}
	void ����(){
		System.out.println("����");
	}
}

class ����ʦ  extends ����ү{
	void ����(){
		System.out.println("java");
	}
	void ����Ӱ(){
		System.out.println("����Ӱ");
	}
}

class DuoTaiDemo {

	public static void main(String[] args) {
//		����ʦ  x = new ����ʦ();
//		x.����Ӱ();//����Ӱ
//		x.����();//java
		//��̬�����
		//ת�͹����У���ʼ���ն�����������������͵�ת����
		����ү x = new ����ʦ();
		x.����();//java
		x.����();//���㣬�̳�
		
		����ʦ y = (����ʦ)x;
		y.����Ӱ();//����Ӱ
		
	}
}



