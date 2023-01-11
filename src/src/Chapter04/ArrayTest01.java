package Chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 선언방법
		int number1[]=new int[10];// int형의 num1배열방 10개
		int[]number2=new int[10];// int형의 num2배열방 10개

		int number3[];              //둘 중 편한거
		number3=new int[10];
				
	   //초기화
	   int number4[]=new int[] {1,2,3,4,5,6,7,8,9,10}; //Fixed-length,둘 중 편한거
	   int number5[]= {1,2,3,4,5,6,7,8,9,10}; 
	   
	   //for문
	   for(int i=0; i<number3.length;i++) {
		   System.out.println(number4[i]=(i+1));//리터널값을 대입후 출력 
	   }//for
	   
	}//main

}//class
