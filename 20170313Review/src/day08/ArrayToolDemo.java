package day08;

public class ArrayToolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,6,7,89,90};
//		ArrayTools tool = new ArrayTools();
		
		int max = ArrayTools.getMax(arr);
		System.out.println("max=" + max);
		
		int index = ArrayTools.getIndex(arr,8);
		System.out.println("index=" + index);
	}

}
