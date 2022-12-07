package ch07_arraylist_1020;


public class StudentTest {

	public static void main(String[] args) {
		
		// 본인이름의 Student 형으로 객체를 생성 학번은 임의
		// 본인 수강 과목 3개 등록 java, spring, android 점수포함
		// 해당 정보 출력하기 .showStudentInfo
		
		//LunchMenu : ArrayList 만들어서 Student 클래스에 추가,
		// 점심 메뉴 추가 기능, 출력하는 기능 만들어서 출력
		// 참고 Subject 참고해서 만들기
		
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentLsy = new Student(1003, "이상용");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentLsy.addSubject("국어", 70);
		studentLsy.addSubject("수학", 85);
		studentLsy.addSubject("영어", 100);
		
		Student studentSeo = new Student(1212, "이고잉");
		
		studentSeo.addSubject("Java", 70);
		studentSeo.addSubject("Spring", 70);
		studentSeo.addSubject("Android", 70);
		
		
		studentSeo.addLunchMenu("dod");
		
		
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
		
		System.out.println("======================================");
		studentLsy.showStudentInfo();
		System.out.println("======================================");
		studentSeo.showStudentInfo();
		
		System.out.println("======================================lunchMenu");
		studentSeo.showLunchList();
		
	}
}
