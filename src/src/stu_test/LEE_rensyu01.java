package stu_test;

public class LEE_rensyu01 {

	public static void main(String[] args) {
		
		int[][] array= {{11,12},{13,14},{15,16},{17,18},{19,21}};
		
		int count=0;
		double avg=0;
		int total=0;
		int alltotal=0;
		
	   for(int i=0; i<array.length; i++) {
		   for(int j=0; j<array[i].length; i++) {
			   total+=array[i][j];
			   count++;
			   
			   avg=total/(double)(array[i].length);
			   System.out.println("각 행의 합 : " +total);
			   System.out.println("각 행의 평균 : " + Math.round(avg));
			   System.out.println("-----------");
			   
			   alltotal+=total; 
			   total=0;
			   avg=0;
			   System.out.println("-----------");
			   
		   }
	   }//for
	   // ArrayTest06 참고
	   double allavg=alltotal/(double)count;
	   System.out.println("전체 총합 : " + alltotal);
	   System.out.println("전체 평균 : " + allavg);
			   
				

	}//main

}//class
