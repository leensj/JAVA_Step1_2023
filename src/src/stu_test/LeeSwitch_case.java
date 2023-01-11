package stu_test;


public class LeeSwitch_case {

	public static void main(String[] args) {

    System.out.println("주사위 눈의 수 : ");
    int num=(int) (Math.random()*10)+1;
    
    switch (num) {
    
    case 1: case 2: case 3: case 4: case 5: case 6:{
    	System.out.println(num+ "점 획득");
    	break;   ///질문하기 
  
    }
    default:
       System.out.println("잘못된 숫자 입니다.");
     }//switch
	}//main
	
}//class
