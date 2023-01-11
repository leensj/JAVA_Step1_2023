package Chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
      String strArray[]= {"java","oracle","html5","css","js","jq","jsp","spring","pythoncamp"};
      
      for(int i=0;i<strArray.length;i++) {
    	  System.out.println(strArray[i]);
      }
      
      System.out.println("---------");
      //확장 for
     for(String lang:strArray) { ///String lang=strArray[];
    	 System.out.println(lang);
     }//for
	}//main

}//class
