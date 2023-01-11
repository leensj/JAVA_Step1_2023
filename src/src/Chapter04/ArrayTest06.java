package Chapter04;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		
		 int sum=0; //초기화
		 for(int i=0; i<score.length; i++) {
		   System.out.println(score[i]);
		   sum+=score[i];
		}//for
		
		System.out.println("총점 : " + sum );
		double avg=sum/(double)(score.length);
		System.out.println("평균 : " + avg);
		//반올림
		System.out.println("평균(반올림): " + Math.round (avg));

	}//main

}//class
