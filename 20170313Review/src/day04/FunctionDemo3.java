package day04;

public class FunctionDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		add(5,6);
//		draw(5,6);
//		System.out.println(add(5,6));
//		boolean b = equals(4,4);
//		System.out.println(b);
//		int i = getMax(5,5);
//		System.out.println(i);
//			Systemchar c = getLevel(89);
//	.out.println(c);
	}

	private static char getLevel(int num) {
		char level;
		if (num >= 90 && num <=100){
			level = 'A';
		}
		else if (num >= 80 && num <=89){
			level = 'B';
		}
		else if (num >= 70 && num <=79){
			level = 'C';
		}
		else if (num >= 60 && num <=69){
			level = 'D';
		}
		else {
			level = 'E';
		}
		return level;
	}

	private static int getMax(int i, int j) {
		/*
		if (i > j){
			return i;
		}else{
			return j;
		}
		*/
		return i > j?i:j;
	}

	private static boolean equals(int i, int j) {
		if (i == j){
			return true;
		}else 
			return false;
	}
	/*
	private static int add(int i, int j) {
		return i + j;
	}
	*/
	/*
	private static void draw(int i, int j) {
		for (int x = 1;x < i;x++){
			for (int y = 1;y <= j;y++){
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
	*/
	
	
	
}
