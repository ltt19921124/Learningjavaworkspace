package 第四章流程控制和数组;

import java.util.Arrays;

public class TestTwoDimension {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[][] a;
//		a = new int[3][];
//		for(int i=0;i>a.length;i++){
//			System.out.println(a[i]);
//		}
//		a[0] = new int[2];
//		a[0][1] = 6;
//		for(int i=0;i<a[0].length;i++){
//			System.out.println(a[0][i]);
//		}
		int[] arr = new int[]{3,4,5,6};
		int[] arr2 = new int[]{3,4,5,6};
		System.out.println("a和a2数组是否相等:" + Arrays.equals(arr, arr2));//true
		
		int[] b = Arrays.copyOf(arr, 6);
		System.out.println("b和arr数组是否相等:" + Arrays.equals(arr, b));//false
		
		System.out.println("b数组为：" + Arrays.toString(b));
		Arrays.fill(b, 2,4,1);
		System.out.println("b数组为：" + Arrays.toString(b));
		
	}

}



