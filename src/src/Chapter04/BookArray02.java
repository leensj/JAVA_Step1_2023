package Chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		
		//Book();5번 호출 
		Book library[]=new Book[5];
	
		library[0]=new Book("데미안","헤르만 해세");
		library[1]=new Book("이솝","몽고메리");
		library[2]=new Book("백설공주","나폴레옹");
		library[3]=new Book("카산","칭키즈칸");
		library[4]=new Book("파이팅","해세");
		
		/*
		library[0].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		library[1].showBookinfo();
		*/
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfo();
			System.out.println();
		}//for

	}
	
}//class