package chapter07;

public class ThisTest {
     
	private int speed;
	private int age;
	private String robotname;
	private String robotnum;
	
	public ThisTest(){
		
	}
	
	
	public ThisTest(int speed, int age, String robotname, String robotnum) {
		super();
		this.speed = speed;
		this.age = age;
		this.robotname = robotname;
		this.robotnum = robotnum;
		
	}///public

	public void Move() {
		speed +=20;
		System.out.println("Robotspeed : "+ speed);
	}
	
	public void stop() {
		speed =0;
		System.out.println("Robotspeed : "+ speed);
	}

	public void Rage() {
		age +=1;
		System.out.println("Robotage : "+ age);
	}
	
	public void RName() {
		
		System.out.println("Robotname :" + robotname);
	}
	
	
	public int getSpeed() {
		return speed;
	}


	public int getAge() {
		return age;
	}


	public String getRobotname() {
		return robotname;
	}


	public String getRobotnum() {
		return robotnum;
	}
	
	
	
	
	
}//class
