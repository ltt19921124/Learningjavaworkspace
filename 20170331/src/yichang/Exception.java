package yichang;

/*
 * ����ʱ�ڷ����Ĳ��������
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
//			����취
		}
		else if(time>10000){
//			����취
		}
		System.out.println(".." + time);
	}

}












