package chapter02;

public class Bit_test1 {

	public static void main(String[] args) {
		//Bit 연산
		
		int nym1= 5; //0101
		int nym2= 10;//1010
		
		// bit or(||)
		int result=nym1 | nym2;
				System.out.println(result);
				// bit AND(|)
				int result1=nym1 & nym2;
						System.out.println(result1);
						// bit XOR(^)
						int result2=nym1 ^ nym2;
								System.out.println(result2);
		
	}

}
