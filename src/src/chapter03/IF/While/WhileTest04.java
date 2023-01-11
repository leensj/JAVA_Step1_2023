package chapter03.IF.While;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		System.out.println("java 교과목 점수를 입력하세요");
	 	
		while(true) {
			
		Scanner scan=new Scanner(System.in);
		    int scr=scan.nextInt();
			
			// 정수가 0미만 또는 100초과이면 while문 중지
			if(scr < 0 || scr > 100)
				  break;
			else if(scr >=60) 
				System.out.println("합격 하셨습니다.");
		    else 
				System.out.println("불합격 하셨습니다.");
			
        System.out.println("프로그램 종료");
		}
	}//main

}//class
