package StringBuffer;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *jdk1.5后出现了功能和StringBuffer一模一样的对象，StringBuilder
		 *
		 *不同的是：
		 *StringBuilder不同步（速度快），而StringBuffer是线程同步的
		 *StringBuilder通常用于单线程，它的出现用于提高效率
		 *
		 *JDK升级
		 *1，简化书写
		 *2，提高效率
		 *3，增加安全性
		 *
		 *
		 *
		 */
	}

}
/*
 
 class StringBuffer{//jdk 1.0
 	public synchronized StringBuffer append(int x){
 		synchronized(lock){
 		
 		}
 	}
 	
 	public synchronized StringBuffer delete(int start,in tend){
 		synchronized(lock){
 		
 		}
 	}
 
 }
 
 */
