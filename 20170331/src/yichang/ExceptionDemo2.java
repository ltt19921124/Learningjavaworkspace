package yichang;

class Demo{
	public void method(int[] arr,int index){
		
		System.out.println(arr[index]);
	}
}

public class ExceptionDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[3];
		Demo d = new Demo();
		d.method(arr,3);
		
	}
	
	
}
