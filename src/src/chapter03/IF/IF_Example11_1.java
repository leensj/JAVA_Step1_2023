package chapter03.IF;

import java.util.Scanner;

public class IF_Example11_1 {

	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 : ");
		String ID=scan.nextLine();
		System.out.println("비밀번호 : ");
		String PW=scan.nextLine();
		//int형으로 형변환 
		//int PW=Integer.parseInt(scan.nextLine());
		int pass=Integer.parseInt(PW);
		
		//중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
		 if(ID.equals("soldesk")) 
	         if(pass==12345) 
                  System.out.println("로그인 성공");
                  else 
                	  System.out.println("비밀번호가 일치하지 않습니다.");
                  else 
                	  System.out.println("로그인 실패!!");
	         
       }
}
