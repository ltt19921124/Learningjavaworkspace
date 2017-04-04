package yichang;

/*
 * 运行时期发生的不正常情况
 * 
 * 
 * 
 * */

public class Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr[3]);
		
		sleep(5);
	}
	
	public static void sleep(int time){
		if(time<0){
//			处理办法
		}
		else if(time>10000){
//			处理办法
		}
		System.out.println(".." + time);
	}

}












