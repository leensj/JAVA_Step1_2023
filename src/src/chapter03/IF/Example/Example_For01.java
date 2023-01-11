package chapter03.IF.Example;

public class Example_For01 {
   public static void main(String[] args) {
	           // 1~100까지의 수중 3의 배수의 합     
	   
	  System.out.println("숫자를 입력하세요.");
	  
	   int sum=0;
	   
	   for(int i=1; i<=100; i++) {
		   
	   if(i % 3 ==0) 
		   sum+=i;
	   }
	    
     }
   
}