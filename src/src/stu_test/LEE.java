package stu_test;

import javax.swing.JOptionPane;

public class LEE {

	public static void main(String[] args) {
		
	String tanaka[]=new String[2]; //몇 번 질문하는지  
	String hasekawa[]=new String[2];
	
	for(int i=0; i<tanaka.length; i++) {
		
	tanaka[i]=JOptionPane.showInputDialog("당신의 성씨는");
	hasekawa[i]=JOptionPane.showInputDialog("당신의 성별은");
	
	System.out.println("당신의 성씨는"+tanaka[i]+"당신의 성별은"+hasekawa[i]);
		
		
	}//for
		
	

	}//main

}//class
