package chapter06;

import java.util.Scanner;


public class GuguDanMAin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GuguDan dan=new GuguDan();
		 
		int num;
		
		System.out.println("출력할 단을 입력하세요");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		dan.showTable(num);
		
		
		
		
	}

}
