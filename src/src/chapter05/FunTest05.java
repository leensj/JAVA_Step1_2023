package chapter05;

public class FunTest05 {

	 
    public String channel; //멤버 변수
    public int channeInt; //멤버 변수
    public int volme; //멤버 변수
    
    public FunTest05() {
    	
    	
    }
	
	public void channe1Up(int volme){
		System.out.println("소리를 "+volme + " 만큼 올립니다");
		
	}
	
	public void channeldown(int volme){
		System.out.println("소리를 "+volme + " 만큼 내립니다");
		
		
		
	}
	
    
	   //오버로딩 (다형성 만족)  
     public void channelChange(String channel){
    	 System.out.println("TV채널을 "+channel + " 로 바꿉니다");
 		
		
		
	}
     //오버로딩 (다형성 만족)
     public void channelChange(int channelInt){
    	 System.out.println("채널을 "+channelInt + " 로 바꿉니다");
 		
 		
 	}
      
     
	
	//---------------------------------
	
	public static void main(String[] args) {
		
		FunTest05 lee = new FunTest05();
				lee.channe1Up(4);
				lee.channeldown(2);
				
				lee.channelChange("4");
				lee.channelChange(3);
		

	} //main

}//class
