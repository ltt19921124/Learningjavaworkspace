package day04;

public class BreakContinueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int x = 0;x < 3;x++){
//			if (x == 1){
//				break;
//			}
//			System.out.println("x=" + x);
		}
		
//		x:for (int x = 0;x < 3;x++){
//			aa:for (int y = 0;y < 4;y++){
////				System.out.println("x=" + x);
//				break x;
//			}
//		}
		/*
		for (int x = 0;x < 11;x++){
			if(x % 2 == 0){
				continue;
//				System.out.println("x=" + x);
			}
		}
		*/
		
		aa:for (int x = 0;x < 3;x++){
			bb:for (int y = 0;y < 4;y++){
				System.out.println("x=" + x);
				continue aa;
			}
		}
	}

}
