package yc;

public class Test {

	/**
	 * @param args
	 */
	//异常是对象，由jdk提供
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		//uncheck exception
		try{
			//打开文件的代码
			System.out.println(2);
			int i = 1 / 0;
			System.out.println(3);
		}
		catch(Exception e){
			e.printStackTrace();//打印异常信息
			System.out.println(4);
		}
		finally{
			System.out.println("finally");//也叫异常出口
			//关闭文件的代码
			//在这里一般做一些清理工作
		}
		System.out.println(5);
	}

}
