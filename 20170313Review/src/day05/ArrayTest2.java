package day05;

public class ArrayTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		toHex(89);
		toHex_1(15);
	}
	/*
	private static void toHex(int num) {
		for(int x = 0;x < 8;x++){
			int temp = num & 15;
			if (temp > 9){
				System.out.print((char)(temp-10+'A'));
			}else{
				System.out.print(temp);
			}
			num = num >>> 4;
		}
	}
	*/

	private static void toHex_1(int num) {
		char[] chs = {'0','1','2','3'
				,'4','5','6','7','8',
				'9','A','B','C','D',
				'E','F'};
		for(int x=0;x < 8;x++){
			int temp = num & 15;
			System.out.print(chs[temp]);
			num = num >>> 4;
		}
	}
}






