import java.io.*;
public class TestChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("F:/from.txt");
			fw = new FileWriter("F:/to.txt");
			char[] buffer = new char[100];//�ֽ���
			int temp = fr.read(buffer,0,buffer.length);
			fw.write(buffer,0,temp);
			String s = new String(buffer);
			System.out.println(buffer);
//			for(int i=0;i<buffer.length;i++){
//				System.out.println(buffer[i]);
//			}
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				fr.close();
				fw.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
