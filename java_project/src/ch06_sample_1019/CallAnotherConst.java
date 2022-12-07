package ch06_sample_1019;


class Person{
	String name;
	int age;
	
	//getter, setter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Person(String, int) 생성자 호출
	Person(){
		this("이름없음", 1);  
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	//메서드 반환형이 class(Person) type
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.getName());
		System.out.println(noName.getAge());
		
		// 변수 선언하는 형이 참조형(Person)
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
		// 가장 큰 type 최상위 클래스 Object
		// 사용한 데이터 type이 다른 type으로 받을 수 있는 방법 : Object 사용
		// Object로 받을 수 있고 , 원래의 type으로 되돌릴 수 있다.(형 변환을 통해서)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
