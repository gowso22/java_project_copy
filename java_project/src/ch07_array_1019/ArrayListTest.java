package ch07_array_1019;

import java.util.ArrayList;


public class ArrayListTest {

	public static void main(String[] args) {
		// Book 제네릭타입형식지정
		ArrayList<Book> library = new ArrayList<Book>();

		
		library.add( new Book("태백산맥", "조정래") );
		library.add( new Book("데미안", "헤르만 헤세") );
		library.add( new Book("어떻게 살 것인가", "유시민") );
		library.add( new Book("토지", "박경리") );
		library.add( new Book("어린왕자", "생텍쥐페리") );
		
		for(int i=0; i<library.size(); i++){
	
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library){
			book.showBookInfo();
		}
		
		// Student 타입으로 ArrayList 만들기 변수이름 students
		// 해당 ArrayList에 각자 알고 있는 이름 3개만 등록
		// Student에 생성자를 잘보고 출력
		// showInfo 이용
		// 기본 for문, 향상된 for문으로 출력하기
		System.out.println();
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("이고잉", 20000));
		students.add(new Student("삼고잉", 30000));
		students.add(new Student("일고잉", 10000));
		
		System.out.println("기본 for문");
		for(int i = 0; i < students.size(); i++) {
			
			Student std = students.get(i);
			std.showInfo();
		}
		
		
		System.out.println("향상된 for문");
		for(Student std : students) {
			std.showInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
