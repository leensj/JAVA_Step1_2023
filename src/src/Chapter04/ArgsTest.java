package Chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		
		//배열선언1
		int a[] = new int[5]; //Fixed-length
		
		//배열선언2
		int b[];//선언
		b=new int[5];
		
		int aval;
		int bval;
		int Tot;
		
		//배열선언3
		args=new String[2]; 
		args[0]="1"; //[0]:첨자   수"0":요소
		args[1]="2";
		
		String[] str;	
        str=new String[10];
        
        //length : 배열의 첨자(메모리)수
        if(args.length ==2) {
        	aval=Integer.parseInt(args[0]);
        	bval=Integer.parseInt(args[1]);
        }else {
        	aval=0;
        	bval=0;
        }
            Tot=aval+bval;
            System.out.println(Tot);
	}//main

}//class
