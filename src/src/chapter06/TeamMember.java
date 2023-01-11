package chapter06;

public class TeamMember {
   
	//멤버변수
	public String teamname; //팀명 
	public String mname;  //팀장
	public String mphone;  //팀장전화번호 
	public String sname; //부팀장
	public String name;   //팀원
	public String gender; //팀원성별
	
	//기본 생성자
	public TeamMember() {}  //디폴트
	
	//오버 로딩 (생성자를 통하여 초기화)
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}

	
	
	//메소드 통한 초기화
	
	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}//class
