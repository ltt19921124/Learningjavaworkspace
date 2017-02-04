import java.io.*;//导入类

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 声明输入流引用
		FileInputStream fis = null;
		//声明输出流的引用
		FileOutputStream fos = null;
		try {
			// 生成代表输入流的对象
			fis = new FileInputStream("F:/from.txt");
			//生成代表输出流的对象
			fos = new FileOutputStream("F:/to.txt");
			// 生成字节数组
			byte[] buffer = new byte[1024];
			while(true){
				int temp = fis.read(buffer,0,buffer.length);
				if(temp == -1){
					break;
				}
				fos.write(buffer,0,temp);
			}
//			fis.close();
//			fos.close();
			// 调用输入流对象的read方法，读取数据
//			int temp = fis.read(buffer, 0, buffer.length);//read方法的
			//返回值是这次一共读取了多少字节的数据
//			fos.write(buffer,0,temp);
//			String s = new String(buffer);
//			s = s.trim();//trim方法将会去除字符串的首位空格和空字符
//			System.out.println(s);
//			for (int i = 0; i < buffer.length; i++) {
//				System.out.println(buffer[i]);
//			}
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e);
		}finally{
			try{
				fis.close();
				fos.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
