package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {

//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
		
		Student schStudent = new Student();
		schStudent.setStudentName("sch");
		System.out.println(schStudent.serialNum);
		System.out.println(Student.serialNum);
		
		schStudent.serialNum++;
		
		System.out.println(schStudent.serialNum);
		System.out.println(Student.serialNum);
		
		Student sch2 = new Student();
		System.out.println(sch2.serialNum);
		
		//Student1 클래스 객체를 생성, 자동으로 학번이 어떻게 부여되는지 확인
		Student1 schStd = new Student1();
		System.out.println(schStd.studentID);
		
		Student1 schStd1 = new Student1();
		System.out.println(schStd1.studentID);
		Student1 schStd2 = new Student1();
		System.out.println(schStd2.studentID);
		Student1 schStd3 = new Student1();
		System.out.println(schStd3.studentID);
		
		
		Student2 schstd4 = new Student2();
		System.out.println(Student2.getSerialNum());
		Student2.setSerialNum(2000);
		System.out.println(Student2.getSerialNum());
	}
}

