package review;

public class switchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int week  =1;
		switch(week){
			default:
				break;
			case 1:
				System.out.println(week + "对应星期一");
				break;
			case 2:
				System.out.println(week + "对应星期二");
			
		}
		int month = 13;
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println(week + "月对应春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(week + "月对应夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(week + "月对应秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(week + "月对应冬季");
//				break;
			default:
				System.out.println(month + "没有对应的季节");
		}
	}

}
