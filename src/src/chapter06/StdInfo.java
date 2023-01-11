package chapter06;

public class StdInfo {
  
	//필드 
	public String Studentname;
	public int grade;
	public int money;
	
	
	// free complie
	
	//생성자 오버로딩 
	public StdInfo(String Studentname,int money) {
		this.Studentname=Studentname;
		this.money=money;
		
	}
	
	//버스
    public void takeBus(Bus bus) {
    	bus.take(1000);
    	this.money-=1000;
    }
  //지하철
    public void takeSubway(Subway subway) {
    	subway.take(1500);
    	this.money-=1500;
    }
   
    	//남은 잔액
    	public void showInfo() {
    		System.out.println(Studentname+"님의 남은 잔액은 : "+money+"원 입니다.");
    	}
    
}
