package chapter02;

public class Logic_Test22 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		System.out.println("------and----");
		boolean flag1=(num1>10) && (num2>20);
		System.out.println("false && false : " + flag1);
		
		boolean flag2=(num1>10) && (num2>0);
		System.out.println("false && false : " + flag2);

		boolean flag3=(num1>0) && (num2>20);
		System.out.println("true && false : " + flag3);
		
		boolean flag4=(num1>0) && (num2>0);
		System.out.println("true && true : " + flag4);
		
	
		System.out.println("------not----");
		//num1과 num2는 같지 않다
		
		boolean flag = (num1 != num2);
		System.out.println(flag);
		
		
	}

}
