package chapter07;

public class Encapsulation {

	private int side;
	private int height;
	
	public Encapsulation () {
	   side=0;
	   height=0;	   
	}
	
	public int Cal_Area(int S, int H) {
		side=S;
		height=H;
		
		return(S*H);
	}
	
	
}
