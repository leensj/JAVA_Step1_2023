package chapter06;

import java.util.Scanner;

public class StudentInfoMAin {

	public static void main(String[] args) {
		
	
		StudentInfo studentkim=new StudentInfo();
		
	
		studentkim.StudentID=1004;
		studentkim.grade=3;
		studentkim.address="서울시 종로구";
		
		
		studentkim.setStudentName("홍길동");
		String name=studentkim.getStudentName();
		
		System.out.println(name);
	}

}
