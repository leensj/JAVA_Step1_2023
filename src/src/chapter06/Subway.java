package chapter06;

public class Subway {

	//멤버
		public String linenumber;
		public int passengercount;
		public int money; //지하철 수입
	
		//디폴트 생성자 생략
		
		public Subway(String linenumber) {
			this.linenumber=linenumber;		
		}
		
		public void take(int money) { //승객이 낸 돈
			this.money += money; //지하철의 수입 증가
			passengercount++; //승객 수
			

		}
		
		public void showInfo() { //버스 정보 출력
			
			System.out.println("지하철 "+linenumber+ "번이 승객은"+passengercount+ "명이고,수입은" + money+"원 입니다.");
		}
}
