package �߳�;

public class Sort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("kk");
		int a[]={1,54,67,89,90,58,37};  
	    int d=a.length;  
//	    int temp=0;  
	  
	    while(true){  
		       d= d / 2;  
		       for(int x=0;x<d;x++){  
		  
		           for(int i=x+d;i<a.length;i=i+d){  
		              int j=i-d;  
		              int temp=a[i];  
		              for(;j>=0&&temp<a[j];j=j-d){  
		                   a[j+d]=a[j];  
		              }  
		              a[j+d]=temp;  
		           }
	//	           d = (int)(d/2);
		       }  
		  
		       if(d==1){  
		           break;  
		       }  
		 }  

	     for(int i=0;i<a.length;i++){  
	        System.out.println(a[i]);  
	  }
//	    int d = 5;
//	    System.out.println(d/2);

	}
	
	
}
