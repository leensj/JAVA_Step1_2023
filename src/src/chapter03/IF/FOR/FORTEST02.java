package chapter03.IF.FOR;

public class FORTEST02 {

	public static void main(String[] args) {
	 
	int j;
	int sum=0;
    System.out.println("1부터100까지의 합을 출력");
    
    for(j=1; j<=100; j++ ) {
    	System.out.println(j+" ");
    	sum+=j;
    }
    	System.out.println();
        System.out.println("1부터 100까지의 합: "+sum+"입니다.");    	
   
	}

}
