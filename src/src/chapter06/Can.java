package chapter06;

public class Can {
	
   //필드
	private String canName;
    private int price;
    
    /*
       can[0]=new Can("환타",1000);
    	can[1]=new Can("콜라",1100);
    	can[2]=new Can("사이다",1200);
    	can[3]=new Can("맥콜",1300);
    	can[4]=new Can("아침햇살",1500);
     */
    
    // 생성자 오버로딩
    public Can(String canName,int price) {
    	this.canName=canName;
    	this.price=price;
    }
    	

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
}//class
