package ���߳�Mars;

public class t {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b = isPrime(91);
		System.out.println(b);
	}
	public static boolean isPrime(int N){
		if( N < 2 ) 
			return false;
				for( int i = 2 ; i < N; i++){
					if( N % i == 0) 
						return false;
				}
				return true;
	}

}
