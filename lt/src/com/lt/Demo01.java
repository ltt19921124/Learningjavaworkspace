package com.lt;
import java.util.Scanner;
/*
 * ���ܣ�Ϊָ���ĳɼ����мӷ֣�֪����������60��Ϊֹ��
 * ����ӷ�ǰ�ĳɼ��ͼӷֺ�ĳɼ�������ͳ�ƼӷֵĴ�����
 * 1������һ����������������ӷֵĴ�����
 * 2��ʹ��ѭ��Ϊ�ɼ��ӷ֡�
 * 3��ÿ��ִ��ѭ���ӷֲ�������һ�֣�����ͳ�ƼӷֵĴ���
 * */


public class Demo01 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����뿼�Գɼ���Ϣ��");
		int score=input.nextInt();
		int count=0;
		System.out.println("�ӷ�ǰ�ĳɼ���"+score);
		input.close();
		while(score<60){
			score++;
			count++;
		}
		System.out.println("�ӷֺ�ĳɼ���"+score);
		System.out.println("������"+count+"�Σ�");
	
	}

}
