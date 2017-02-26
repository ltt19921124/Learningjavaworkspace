package 线程间通信;

/*
 * 多线程：
 * 多个线程在处理同一个资源
 * 
 * 
 * */

class Resource{
	String name;
	String sex;
}

//输入
class Input implements Runnable{
	Resource r ;
	Input(Resource r){
		this.r = r;
	}
	public void run(){
		int x = 0;
		while(true){
			if(x==0){
				r.name = "";
				r.sex = "";
			}
			else{
				r.name = "";
				r.sex = "";
			}
			x = (x+1) % 2;
		}
	}
}

//输出
class Output implements Runnable{
	Resource r ;
	Output(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			System.out.println(r.name + "....." + r.sex);
		}
	}
}

public class ResourceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}




