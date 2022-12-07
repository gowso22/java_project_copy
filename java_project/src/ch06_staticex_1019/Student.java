package ch06_staticex_1019;

public class Student {
	
	// static 키워드 사용하여 전역변수로 사용, 정적 변수, 리소스라고도 표현
	public static int serialNum = 1000;
	
	int studentID;
	String studentName;
	int grade;
	String address;
	

	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String name){
		studentName = name;
	}

	
	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
