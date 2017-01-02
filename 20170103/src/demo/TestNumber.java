package demo;

public class TestNumber {

	/**
	 * @param args
	 * 这是打印出100到200所有的素数
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
