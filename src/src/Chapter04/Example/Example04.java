package Chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class Example04 {

	public static void main(String[] args) {
		// 로또번호 6개를 담을 배열
     
	int num;
	int cnt=0;
	int[] lotto=new int[6];
	
    System.out.println("==== 이번주 로또 예상번호 =====");		
	num=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
    while(num > cnt) {
    	
    	System.out.println("["+(cnt+1)+ "]: ");	
    	for(int i=0; i<lotto.length; i++) {
    		lotto[i]=(int)(Math.random()*(45)+1); 
    		System.out.print(lotto[i]+" ");
    	if (num==lotto [i]) {
    		   num= lotto[i];
    		   i--;
    		   break;
    	}//if
    		
    	} //for
    		System.out.println();
    		cnt++;
    		
    }
    
	}//main

}//class
