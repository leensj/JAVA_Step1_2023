package Chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		//얕은 복사--메모리 하나만 사용
		
		Book[] bookarray1 = new Book[3];
		//Book bookarray1 3개의 첨자를 갖는 배열 선언
		Book[] bookarray2 = new Book[3];
		//Book bookarray2 3개의 첨자를 갖는 배열 선언
		
		//초기화 
		bookarray1[0]=new Book("데미안","헤르만 해세");
		bookarray1[1]=new Book("이솝","몽고메리");
		bookarray1[2]=new Book("백설공주","나폴레옹");
		
		System.out.println("-----------원본(bookarray1)-----");
		for(int i=0; i<bookarray1.length; i++) {
			bookarray1[i].showBookinfo();
		}//for
			
	    //복사
         System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
        
         System.out.println("-----------복사본(bookarray2)-----");
         for(int i=0; i<bookarray2.length; i++) {
 			bookarray2[i].showBookinfo(); 
 			}
       //====================================
         System.out.println();
         bookarray1[0].setBookname("나목");
         bookarray1[0].setAuthor("박완선");
         
         System.out.println("-----------원본변경(bookarray1)-----");
 		for(int i=0; i<bookarray1.length; i++) {
 			bookarray1[i].showBookinfo();
 		}
 		
 		System.out.println("-----------복사본(bookarray2)-----");
        for(int i=0; i<bookarray2.length; i++) {
			bookarray2[i].showBookinfo(); 
			}
 		
 		System.out.println();
	}//main

}//class
