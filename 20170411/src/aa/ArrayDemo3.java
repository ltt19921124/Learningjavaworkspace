package aa;

public class ArrayDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,78,34,55,3,2,9,80};
		
		System.out.println("length:" + arr.length);
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
	}

}
