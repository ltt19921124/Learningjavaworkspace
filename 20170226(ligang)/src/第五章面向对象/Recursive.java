package 第五章面向对象;

public class Recursive {

	/**
	 * @param args
	 * 递归方法
	 */
	public static int fn(int n){
		if(n == 0){
			return 1;
		}else if(n == 1){
			return 4;
		}else{
			return 2 * fn(n - 1) + fn(n - 2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fn(10));
	}
}









