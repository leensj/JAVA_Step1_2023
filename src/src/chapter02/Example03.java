package chapter02;

public class Example03 {

	public static void main(String[] args) {
		
		int score1= 77;
	   String lee;
	   lee=(score1>=60)? "합격": "불합격";
	   System.out.println(lee);
	System.out.println("===============");
	
		int score2=90;
		String haku;
		haku= (score2>=91)?"A" : ((score2 >=81)?"B" : "C");
		System.out.println("haku : " + haku);
		
		

	}

}
