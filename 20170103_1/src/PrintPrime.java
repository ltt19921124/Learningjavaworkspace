
public class PrintPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 100; i < 201; i++) {
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
