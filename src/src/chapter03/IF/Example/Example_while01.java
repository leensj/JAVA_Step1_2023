package chapter03.IF.Example;

import java.util.Scanner;

public class Example_while01 {

	public static void main(String[] args) {
		
		
		boolean run=true;
		
		int balance=0;
		
		
		while(run) {
		 	
		Scanner scan=new Scanner(System.in);
		int  menuNum = Integer.parseInt(scan.nextLine());
        switch (menuNum) {	
	//0 이하의 금액이 입력되었을때 예외처리
		case 1 :
			System.out.println("예금액");
			balance += Integer.parseInt(scan.nextLine());
		case 2 :
			System.out.println("출금액");
			balance += Integer.parseInt(scan.nextLine());
				break;
		case 3 :
			System.out.println("잔고>");
			System.out.println(balance);
			break;
		case 4 :
			run = false;
			break; //switch
						
		
        }//switch
		
	}//while
		System.out.println("프로그램 종료");

  }//main
}//class
