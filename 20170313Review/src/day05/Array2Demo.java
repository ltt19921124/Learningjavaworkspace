package day05;

public class Array2Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[3];
		int[][] arr1 = {{1},{3},{7}};
//		System.out.println(arr1);
		int sum = 0;
		for(int x = 0;x < arr1.length;x++){
			for (int y = 0;y < arr1[x].length;y++){
				System.out.print(arr1[x][y] + ",");
				sum += arr1[x][y]; 
			}
		}
		System.out.println("sum=" + sum);
	}

}
