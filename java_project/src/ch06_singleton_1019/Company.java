package ch06_singleton_1019;

public class Company {

	
	// static 공유자원, 객체 생성없이 접근 가능
	private static Company instance = new Company();
	String name;
	String address;
	int age;
	
	private Company(){}

	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	

}
