package chapter03.IF;

import javax.swing.JOptionPane;

public class IF_Example11111111 {

	public static void main(String[] args) {
		
		 
		
		int age;
		char grade;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("당신의 나이는?"));
		
		if (age <=10) {
			grade = 'A';
			System.out.println("베스트입니다");
		}
		else if (age <20) 
			grade= 'B';			
	
		else if (age <30) 
			grade= 'C';
		
		else 
			grade = 'D';
		
		System.out.println("당신의 신체등급은:"+grade+ "입니다");
		
		
		
		
		
		

		
	}
}