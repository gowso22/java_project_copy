package ch05_test_1018;

public class Student2 {

	String studentName;
	int studentNum;
	String email;
	String location;
	
	// 클래스 맴버 변수 선언
	
	public void studentGetInfo() {
		System.out.println("이름은 " + studentName);
	}
	
	public static int sum2(int num1, int num2) {
		System.out.print("sum2함수의 값 ");
		System.out.println(num1 + num2);
		
		return num1+num2;
	} // int, return여부 확인
	
	public void sum(int num1, int num2) {
		System.out.print("sum함수의 값 ");
		System.out.println(num1 + num2);
		
	} //void return여부 확인

	public static void main(String[] args) {
		
		Student2 sch = new Student2();
		// 해당 객체를 생성하는 new 키워드
		// Student2() : 매개변수가 없는 기본 생성자
		// 기본값을 초기화하는 역할.
		
		sch.sum(10, 20); // sum함수 호출
		Student2.sum2(10, 30); // sum2함수 호출

		Student2 sch2 = new Student2();
		
		sch.studentName = "이고잉";
		sch2.studentName = "삼고잉";
		
		sch.studentGetInfo();
		sch2.studentGetInfo();
		
	}
}

