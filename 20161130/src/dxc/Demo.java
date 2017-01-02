package dxc;

public class Demo implements Runnable{

	/**
	 * @param args
	 */
	/*
	private String name;
	Demo(String name){
		this.name = name;
	}*/
	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"...i="+i);
		}
	}

}
