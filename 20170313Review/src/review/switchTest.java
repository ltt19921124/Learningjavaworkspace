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
				System.out.println(week + "��Ӧ����һ");
				break;
			case 2:
				System.out.println(week + "��Ӧ���ڶ�");
			
		}
		int month = 13;
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println(week + "�¶�Ӧ����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(week + "�¶�Ӧ�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(week + "�¶�Ӧ�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(week + "�¶�Ӧ����");
//				break;
			default:
				System.out.println(month + "û�ж�Ӧ�ļ���");
		}
	}

}