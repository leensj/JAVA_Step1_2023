package chapter06;

public class Bus {
  
	//멤버
	int busnumber;
	int passengercount;
	int money;
	
	//디폴트 생성자 생략

	public Bus(int busnumber) {
		this.busnumber=busnumber;		
	}
	 
	public void take(int money) { //승객이 낸 돈
		this.money += money; //버스의 수입 증가
		passengercount++; //승객 수
		

	}
	
	public void showInfo() { //버스 정보 출력
		
		System.out.println("버스 "+busnumber+ "번이 승객은"+passengercount+ "명이고,수입은" + money+"원 입니다.");
	}
	
}//class
