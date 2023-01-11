package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		//객체생성
		Start st=new Start(); 
		
		while(true) {
			System.out.println("숫자를 입력");
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			check=st.check(select);
			
			if (check.equals("SUCCESS"))
				break;
		}
		

	}//main

}//class
