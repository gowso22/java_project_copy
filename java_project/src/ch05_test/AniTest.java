package ch05_test;

public class AniTest {

	public static void main(String[] args) {
		
		//객체 생성 - 클래스명 참조형변수 = new 해당클래스의기본생성자();
		Animal dog = new Animal();
		Animal cat = new Animal();
		
		//cat name, age 생성
		cat.name = "고양이";
		cat.age = 3;
		
		// dog name, age 생성
		dog.name = "강아지";
		dog.age = 1;
		
		//기본 메서드showInfo 출력
		dog.showInfo();
		cat.showInfo();
	
	System.out.println(cat);
	System.out.println(dog);
	}

}