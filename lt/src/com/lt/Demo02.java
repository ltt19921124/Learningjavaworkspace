package com.lt;
import java.util.Scanner;
/*
 * ���ܣ�
 * 
 * */

public class Demo02 {
	public static void main(String[] args) {
		int classNum=3;
		int stuNum=4;
		double sum=0;
		double avg=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=classNum;i++){
			sum=0;
			System.out.println("***�������"+i+"���༶�ĳɼ���***");
			for(int j=1;j<=stuNum;j++){
				System.out.println("�������"+j+"��ѧԺ�ĳɼ���");
				int score=input.nextInt();
				sum=sum+score;
			}
			avg=sum/stuNum;
			System.out.println("��"+i+"���༶ѧ����ƽ����Ϊ��"+avg);
		
		}
		
	}

}
