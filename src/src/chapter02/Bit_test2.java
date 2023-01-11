package chapter02;

public class Bit_test2 {

	public static void main(String[] args) {
		
		int nym=0B00000101; //5
		System.out.println(nym);
		
		System.out.println(nym <<2);//증가		
		System.out.println(nym >>2);//감소
		System.out.println("-------");
		
		int a,b,c; 
		a=5;
		b=2;
		c=a>>b;
		System.out.println(c);
		
		c=a<<b; //증가
		System.out.println(c);
		
		
		
	}

}
