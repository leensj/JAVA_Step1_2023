package Chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		//깊은 복사
		
		//book클래스의 배열 만들기 3개
		Book bookarray1[]=new Book[3];//선언(접수)
		Book[] bookarray2=new Book[3];
		
		//초기화
		bookarray1[0]=new Book("데미안","헤르만 해세");
		bookarray1[1]=new Book("이솝","몽고메리");
		bookarray1[2]=new Book("백설공주","나폴레옹");
		
		//bookarray2 객체 생성 
		bookarray2[0]=new Book();
		bookarray2[1]=new Book();
		bookarray2[2]=new Book();
		
		System.out.println("-----------원본(bookarray1)-----");
		for(int i=0; i<bookarray1.length; i++) {
			bookarray1[i].showBookinfo();
			}
		
		//깊은 복사
		
		for(int i=0; i<bookarray1.length; i++) {
			bookarray2[i].setBookname(bookarray1[i].getBookname());
			bookarray2[i].setAuthor(bookarray1[i].getAuthor());
		}//for
			System.out.println("-----------복사본(bookarray2)-----");
	        for(int j=0; j<bookarray2.length; j++) {
				bookarray2[j].showBookinfo(); 
				}
	 		//=============================================
	        System.out.println();
	         bookarray1[0].setBookname("나목");
	         bookarray1[0].setAuthor("박완선");
	         
	         System.out.println("-----------원본변경(bookarray1)-----");
	 		for(int i=0; i<bookarray1.length; i++) {
	 			bookarray1[i].showBookinfo();
	 		}
	 		
	 		System.out.println("-----------복사본변경(bookarray2)-----");
	        for(int i=0; i<bookarray2.length; i++) {
				bookarray2[i].showBookinfo(); 
				}
	 		
	 		System.out.println();
	 			
	
	}//main

}//class
