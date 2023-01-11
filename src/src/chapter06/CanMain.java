package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String select="";
		int money=0;
		
		Vending ven=new Vending();
		ven.init(); //음료준비
		
		System.out.println("돈을 투입하세요 : ");
		Scanner scan=new Scanner(System.in);
		money=scan.nextInt(); //돈투입
		ven.showCans(money);  
		System.out.println("====================");
		
		
		System.out.println("음료수를 선택하세요 : ");		
		select=scan.next(); //음료 종류 선택
		ven.outCan(select); 
		
		
          		
	}//main

}//class
