package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
	
		 Overload obj1=new Overload();
		 obj1.Disp();
		 System.out.println();
		 
		 Overload obj2=new Overload(33, 180.5f);
		 obj1.Disp();
		 System.out.println();
		 
		 Overload obj3=new Overload(33, 180.5f,"이시이");
		 obj1.Disp();
		
		 

	}

}
