package ch05_test;

public class Person {
	//private - get, set 함수를 이용해서 해당 데이터 우회접근한다.
	private String name;
	float height;
	float weight;
	
	// generate getters and setters로 생성
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	// 기본 생성자 - 맴버변수 초기화
	  // 기본 생성자는 해당클래스 내에서 아무런 생성자가 없다면 
	  // 시스템에서 기본으로 만들어준다.
	  public Person() {}
	
	  // 매개변수 1개인 생성자
	  public Person(String pname) {
		   name = pname;
	  }
	  
	  // 매개변수 3개인 생성자
	  public Person(String pname, float pheight, float pweight){
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }
	  
	  public void showInfo() {
		  System.out.println("이름  : " + name);
		  System.out.println("키 : " + height);
		  System.out.println("몸무게 : " + weight);
	  }
}   

