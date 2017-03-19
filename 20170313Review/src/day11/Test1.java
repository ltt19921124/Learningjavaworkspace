package day11;

import java.util.Scanner;

class TestMax{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
	
		for(int i=0;i < n;i++){
			nums[i] = in.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int acc = 0;
		for (int i = 0; i < n; i++) {
			acc += nums[i];
			if(acc > max)
				max = acc;
			if(acc < 0)
				acc = 0;
		}
		System.out.println(max);
	}
}




