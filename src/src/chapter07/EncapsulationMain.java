package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int Side;
		int Height;
	    int Area;
	    
	    Side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
	    Height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
	    
	    
	    //객체생성
	    Encapsulation obj=new Encapsulation();
	    
	  //Encapsulatio의 매소드를 사용하여 사각형의 넓이 구하기 
	    Area=obj.Cal_Area(Side,Height);
	    
	    System.out.println("사각형의 넓이는 : "+ Area+"입니다.");
	    String str="사각형의 넓이는 : " + Area+ "입니다" ;
	    JOptionPane.showConfirmDialog(null, str);
            
		

	}//main

}//class
