package com.lt;
import java.util.Scanner;
/*
 * 功能：为指定的成绩进行加分，知道分数大于60分为止。
 * 输出加分前的成绩和加分后的成绩，并且统计加分的次数。
 * 1，定义一个变量，用来保存加分的次数。
 * 2，使用循环为成绩加分。
 * 3，每次执行循环加分操作，加一分，并且统计加分的次数
 * */


public class Demo01 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入考试成绩信息：");
		int score=input.nextInt();
		int count=0;
		System.out.println("加分前的成绩："+score);
		input.close();
		while(score<60){
			score++;
			count++;
		}
		System.out.println("加分后的成绩："+score);
		System.out.println("共加了"+count+"次！");
	
	}

}
