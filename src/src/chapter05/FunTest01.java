package chapter05;

import javax.swing.JOptionPane;
 
public class FunTest01 {
	
	//합계 메소드
    //접근 지정자 : public(공용 : 제한없음)// protected(패키니 내에서 공용됨)/
	//void :return 없음
	
	public static void sum(int num1,int num2) {
		//int num1 = 3;
		//int num2 = 5;
		int total=num1+num2;
		System.out.println(total);
		
	}
		
	  
	
	
	 //실행 담당하는 매소드 
	public static void main(String[] args) {
		
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(a,b);
		
		
		
	

	}//main
	
	/*
	//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨
	public static void sum(int num1,int num2) {
		//int num1 = 3;
		//int num2 = 5;
		int total=num1+num2;
		System.out.println(total);
	}
	
	*/
}//class
