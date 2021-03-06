package TwoSum;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = {2,7,11,15};
		int target = 9;
//		twoSum(num,target);
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
//		short s1 = 1;
//		s1 = s1 + 1;
	}
	
	public static int[] twoSum(int[] num, int target) {
	    int[] indice = new int[2];
	    if (num == null || num.length < 2) return indice;
	    int left = 0, right = num.length - 1;
	    while (left < right) {
	        int v = num[left] + num[right];
	        if (v == target) {
	            indice[0] = left + 1;
	            indice[1] = right + 1;
	            break;
	        } else if (v > target) {
	            right --;
	        } else {
	            left ++;
	        }
	    }
	    return indice;
	}

}
