package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IF_Example11 {

	public static void main(String[] args) {
    // Scanner scan이라는 인스턴스 변수선언 
		//id라는 변수로 아이디 받기
		
		//PW라는 변수로 비번 받기(String) => 숫자로 받되 String 
		
		//int형으로 형변환 
		// 중첩질의를 사용하여 로그인 성공과 비밀번호 다름,아이디 없음
		 
		Scanner scan= new Scanner(System.in);
		
		String id="lee";// 인스턴스 변수
        int pw=1220;
		
        String ID= JOptionPane.showInputDialog("아이디를 입력해주세요");
        int pass=Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
        
		if(id.equals(id)) 
			if(pw==1220)
				System.out.println(id + "로그인 성공 환영합니다");
		
			else 
				System.out.println("비밀번호가 다릅니다");
		    else  
		    	System.out.println("아이디가 없습니다");
		  

    }

}
