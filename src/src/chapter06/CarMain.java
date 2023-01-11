package chapter06;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar=new Car();
		
		myCar.company ="현대";
		myCar.color = "검정";
		myCar.model="그랜저";
		myCar.speed=0;
		myCar.maxSpeed=350;
	 	
		System.out.println("자동차 회사 :"+myCar.company);
		System.out.println("색상 :"+myCar.color);
		System.out.println("차 모델 :"+myCar.model);
		System.out.println("현재 속도 :"+myCar.speed);
		System.out.println("그랜저의 최고 속도는 "+myCar.maxSpeed+"입니다.");
		//필드 값 변경
		myCar.speed=77;
		System.out.println("변경된 현재 속도: "+myCar.speed );
		
	}

}
