package chapter07;

public class CarMain {

	public static void main(String[] args) {
	
		// 객체 생성하면서 초기화
		Car car=new Car("검정",3000);
		// 멤버 변수 이용하여 하나씩 초기화
		
        // 멤버 변수에 직접 접근해서 초기화 후 출력
	
		
	    System.out.println("color : " + car.color);
		System.out.println("cc" + car.cc);
		System.out.println("--------------------------------------");
		
		//메소드를 이용한 출력 
		System.out.println("--------------------------------------");
	     System.out.println("color : " + car.getColor());
		System.out.println("cc" + car.getCc());
	}//main

}//class
