package day11;

import java.util.Scanner;

class Test {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNextInt()){
			n = scan.nextInt();
			int[] arr = new int[n];
			for(int i=0;i < n;i++){
				arr[i] = scan.nextInt();
			}
			int[] dp = new int[n];
			dp[0] = arr[0];
			int max = arr[0];
			for(int i = 1;i < n;i++){
				if (dp[i-1] + arr[i] > arr[i])
					dp[i] = dp[i-1] + arr[i];
				else
					dp[i] = arr[i];
				if(dp[i] > max){
					max = dp[i];
				}
			}
			System.out.println(max);
		}
		
	}

}
