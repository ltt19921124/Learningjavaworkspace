package demo;

public class TestNumber {

	/**
	 * @param args
	 * ���Ǵ�ӡ��100��200���е�����
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 100; i < 201; i++){
			boolean b = false;
			for (int j = 2; j < i; j++) {
				int k = i % j;
				if(k == 0){
					b = true;
				}
			}
			if(!b){
				System.out.println(i);
			}
		}
	}

}
