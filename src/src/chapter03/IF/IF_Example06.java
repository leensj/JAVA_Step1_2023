package chapter03.IF;

public class IF_Example06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;
		// +1: 0부터 시작함 
		 
		if(num==1) {
		System.out.println("1점 -> 순대");
		}
		else if(num==2) {
			System.out.println("2점 -> 떡볶이");
			}
		else if(num==3) {
			System.out.println("3점 -> 오튀");
			}
			
		else if(num==4) {
			System.out.println("4점 -> 깻잎");
		}
		
		else if(num==5) {
			System.out.println("5점 -> 어묵");
		}
		
		else 
			System.out.println("6점 -> 꽝꽝");
	
		
	}

}
