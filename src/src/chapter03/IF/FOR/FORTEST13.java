package chapter03.IF.FOR;

import java.util.Scanner;

public class FORTEST13 {
 
	public static void main(String[] args) {
     // 구구단
		/*
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) 
				System.out.println(i + " * "+j+"="+(i*+j));
		}
		System.out.println("=========");
		*/ 
		System.out.println("단을 입력하세요: ");
		Scanner scan=new Scanner(System.in);
		int j=scan.nextInt();
		
			for(int i=1;i<10;i++) 
				System.out.println(j + " * "+i+"="+(j*+i));
		
	}

}
