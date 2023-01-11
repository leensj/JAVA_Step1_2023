package chapter03.IF.FOR;

import java.util.Scanner;

public class FORTEST17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★출력
		Scanner scan = new Scanner(System.in);
	    
	    int n;
	    System.out.print("정수를 입력하세요 : ");
	    n=scan.nextInt();
		 
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		

	}//main 

}//class
