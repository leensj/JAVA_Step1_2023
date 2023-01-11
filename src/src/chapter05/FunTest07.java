package chapter05;

import java.util.Scanner;

public class FunTest07 {
 
	
    public FunTest07() {
		
	}
	
	
	private static void Edustep (int step) {
		
		
		
		if(step==1) {
			System.out.println("현재 수업 단계는 step11입니다.");		
		}else if(step==2) {
			System.out.println("현재 수업 단계는 step22입니다.");
		}else if(step==3) {
			System.out.println("현재 수업 단계는 step33입니다.");
		}else {
			System.out.println("현재 수업이 없습니다");
		}
		  
			
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("스터디 단계를 입력하세요");
		int number=scan.nextInt();
		//retyrn 값이 있는경우
	    //String step= Edustep(number);
	    //System.out.println("현재 수업 단계는 : " +step+ "입니다.");
	    
	    //return값이 없는 경우
	    Edustep(number);
	    
        
	}

}//class
