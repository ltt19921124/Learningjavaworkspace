package 第四章流程控制和数组;

import java.io.BufferedReader;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Gobang gb = new Gobang();
			gb.initBoard();
			gb.printBoard();
			BufferReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputStr = null;
			while((inputStr = br.readLine()) != null){
				String[] posStrArr = inputStr.split(",");
				int xPos = Integer.parseInt(posStrArr[0]);
				int yPos = Integer.parseInt(posStrArr[1]);
				gb.board[xPos - 1][yPos - 1] = "●";
				gb.printBoard();
				System.out.println("请输入您下棋的坐标，以x,y的格式");
			}
		}
	}


