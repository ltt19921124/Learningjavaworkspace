package ���������̿��ƺ�����;

public class TestForError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int count = 0;count < 10;count++){
			System.out.println(count);
			count *= 0.1;
		}
	}

}
