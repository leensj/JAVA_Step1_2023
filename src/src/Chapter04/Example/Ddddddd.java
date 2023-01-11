package Chapter04.Example;

import javax.swing.JOptionPane;

public class Ddddddd {

	public static void main(String[] args) {
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("==== 이번주 로또 예상번호 ====");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
	   while(number > cnt ) {
		  System.out.println("["+(cnt+1)+"] : ");
		  for (int i=0 ; i < lotto.length; i++) {
				lotto[i]= (int)(Math.random()*(45)+1);
				System.out.print(lotto[i]+" ");
			if (number == lotto [i]) {
				number = lotto[i];
				i--;
				break;
			}
				
							
			}
			System.out.println();
			cnt++;
		   
		   
}//while
}//main
}//class
	

