package chapter03.IF.FOR;

import java.util.Scanner;

public class FORTEST16 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println();
		for(int i=1; i<=9; i++) {
			System.out.println("["+i+"단"+"]"+"\t");
		}
		System.out.println();
		for(int i=2; i<=9; i++) {
			
			for(int j=2; j<=9; j++)
			 
				System.out.println(j + " * "+i+"="+j*i+"\t");
		}
		
		 

	}

}
