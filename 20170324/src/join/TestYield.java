package join;

public class TestYield extends Thread{
	
	public TestYield(){
		
	}
	public TestYield(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i < 50;i++){
			System.out.println(getName() + "..." + i);
			if(i == 20){
				Thread.yield();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestYield ty1 = new TestYield("¸ß¼¶");
//		ty1.setPriority(Thread.MAX_PRIORITY);
		ty1.start();
		TestYield ty2 = new TestYield("µÍ¼¶");
		ty2.start();
		
	}

}
