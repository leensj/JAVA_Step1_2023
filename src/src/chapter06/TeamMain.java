package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
      TeamGroup team=new TeamGroup();
      TeamMember t=new TeamMember();
      //메소드를 통해서 팀명을 초기화
      
      t.setTeamname("허수아비");
      System.out.println("팀명 : "+t.getTeamname());
  	  System.out.println("----------[팀원 명단]---------");
  	  team.init();
  	  team.Disp();
  	  
  	  System.out.println();
  	  t.setMname("조현수 팀장님");
  	  t.setMphone("010-1010-1010");
  	  t.setTeamname("허수아비");
  	  t.setGender("남,여");
  	  t.setSname("신진혁 부팀장님");
  	  t.setName("이진학");
  	System.out.println("팀장  : " +  t.getMname());
  	System.out.println("팀장님 전화번호  : " +  t.getMphone());
  	System.out.println("팀 이름  : " +  t.getTeamname());
  	System.out.println("팀 성별 : " +  t.getGender());
  	System.out.println("부팀장님 : " +  t.getSname());
  	System.out.println("팀원  : " +  t.getName());
		
	}//main

}//class
