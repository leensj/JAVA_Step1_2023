package chapter03.IF.While;

import javax.swing.JOptionPane;

public class WhileTest07 {

	public static void main(String[] args) {
		 
			  int num=1;
			  int sum=0;
		
	          sum+=num;
	          num++;
	          
	          int num1;
	          int num2;
          
          do {
        	  num1=Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
        	  num2=Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
        	  
        	  if(num1 == num2) {
        		   System.out.println("인증 성공!");
        	  break;
        	  }
        		  
        	  System.out.println("다시 입력하세요");
        	  
          }while(num1 != num2);
        		   
	}

}
