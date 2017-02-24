package system;

public class insetSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		insertSort();
	}

	public static void insertSort() {
		int a[] = { 49, 38, 65, 97, 76, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53,
				51 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			temp = a[i];
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j]; // 将大于temp的值整体后移一个单位
			}
			a[j + 1] = temp;
		}
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {

			if (i != a.length - 1)
				System.out.print(a[i] + ",");
			else
				System.out.print(a[i] + "]");
		}
	}
}
