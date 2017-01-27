
import java.util.*;

public class ArrayDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * */
		// λ���û�
		int[] arr = { 4, 7, 8, 9, 45, 89 };
		int index = halfSearch(arr, 89);
		System.out.println("index=" + index);
		
		int index1 = Arrays.binarySearch(arr, 89);//�۰���ң�Ҳ�ж��ֲ��ң�,-min-1,���أ�
		//������ڷ���Ԫ�ص�λ�ã���������ڣ�����Ӧ�ò����λ�õĸ����ټ�һ
		System.out.println("index1=" + index1);
		// ���鳣�����ܣ�����
	}

	public static int getMax(int[] arr, int key) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == key) {
				return x;
			}
		}
		return -1;
	}
	/*
	 * ���ֲ���
	 */
	public static int halfSearch(int[] arr, int key) {
		int max, mid, min;
		min = 0;
		max = arr.length - 1;
		mid = (max + min) / 2;

		while (min<=max) {
			mid = (max + min) >> 1;
			if (key > arr[mid]) {
				min = mid + 1;
			} else if (key < arr[mid]) {
				max = mid - 1;
			}
			else
				return mid;
		}
		return -1;
	}
	/*
	 * ��һ����������飬�����������д洢һ����������֤������� ��������ģ���ô���Ԫ�ص��±�Ӧ���Ƕ��٣� ˼·���۰���ҡ�
	 */

}