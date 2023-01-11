package chapter06;

public class Student {


	//필드 
	
	int StudentID;
	private String StudentName;
	int grade;
	String address;
	public String Student;
	
	
	//디폴트 생성자 (free complie)
	//오버로딩된 생성자가 있을 시 디폴트를 사용하기 위해서는 반드시 명시한다(즉 생략이 불가능)
	public Student() {
		
	}
	
	//생성자 오버로딩
	public Student(String StudentName, String address) {
		this.StudentName=StudentName;
		this.address=address;
		
	}
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public  void showStudentInfo()
	{
		System.out.println(StudentName+ " , " + address );
	}
	
	

	
	
}//class
