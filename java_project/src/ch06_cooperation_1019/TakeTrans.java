package ch06_cooperation_1019;

public class TakeTrans {

	public static void main(String[] args) {
	// 객체 생성, 생성자는 매개변수가 2개인 생성자 호출해서 객체 만들기
		
	Student std = new Student("이고잉", 20000);
	
	Bus bus2 = new Bus(2);	
	std.takeBus(bus2);
	Subway subway1 = new Subway("1호선");
	std.takeSubway(subway1);
	
	std.showInfo();	
		
	bus2.showInfo();	
	subway1.showInfo();
		
	Student std1 = new Student("삼고잉", 20000);
	std1.takeBus(bus2);
	std1.takeSubway(subway1);
	std1.showInfo();
	
	// 추가 - 카카오택시 만들기 
	// 기존 버스의 맴버의 메서드를 활용	
	// 본인 이름으로 Student 객체를 생성해서 카카오택시 타고, 해당 학생의 정보와 카카오택시의 정보를 출력
	
	Student sch = new Student("sch", 500000);
	KakaoTaxi kt = new KakaoTaxi(4885);
	
	sch.takeTaxi(kt);
	
	sch.showInfo();
	kt.showInfo();
	
	
	
		
		// 두 명의 학생을 생성
//		  Student studentJames = new Student("James", 5000);   
//		  Student studentTomas = new Student("Tomas", 10000);
//		  // 디버깅 한번 수행하고 ㅇ
//		  //본인 이름으로 생성하기. ㅇ
//		  // 버스, 지하철 타보기.
//		  // 택시 만들어서 타보세요.
//		  Student lsy = new Student("이상용씨", 20000);
//		  Bus bus103 = new Bus(103);
//		  lsy.takeBus(bus103);     // james가 100번 버스를 탐
//		  lsy.showInfo();           // james 정보 출력
//		  bus103.showInfo();                // 버스 정보 출력
//		  
//		  Subway subwayOrange = new Subway("1호선");  
//		  lsy.takeSubway(subwayOrange);  // Tomas가 2호선을 탐
//		  lsy.showInfo();                 // Tomas 정보 출력
//		  subwayOrange.showInfo(); 
		   
//		  Bus bus100 = new Bus(100);
//		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
//		  studentJames.showInfo();           // james 정보 출력
//		  bus100.showInfo();                // 버스 정보 출력
//		  
//		  Subway subwayGreen = new Subway("2호선");  
//		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
//		  studentTomas.showInfo();                 // Tomas 정보 출력
//		  subwayGreen.showInfo();   
	}
}
