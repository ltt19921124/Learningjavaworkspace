package day04;

public class FunctionDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		double d = add(5.6,8.9);
//		System.out.println(d);
		int a = add(5,6,89);
		System.out.println(a);
//		int i = add(5,8,9);
//		System.out.println(add(5,7,8));
		
	}
	/*
	public static int add(int i, int j, int k) {
		
		return i + j + k;
		
	}
	*/
	
	//两个小数的和
	public static double add(double a,double b){
		return a + b;
	}
	
	//三个小数的和
	public static int add(int a,int b,int c){
		return a + b+ c;
	}

}
