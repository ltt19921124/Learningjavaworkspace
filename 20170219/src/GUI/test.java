package GUI;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
//		int target = 9;
		twoSum(arr,9);
		
	}
	public static  int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}




