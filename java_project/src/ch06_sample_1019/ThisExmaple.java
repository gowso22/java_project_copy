package ch06_sample_1019;

import java.util.zip.CheckedOutputStream;

class BirthDay{

	int day;
	int month;
	int year;
	String name;

	// 맴버 변수에 name 추가, 멤버로 get/set 추가, 해당 생성자를 매개변수 4개인 것으로 추가
	// 매개변수 4개를 호출하는 객체를 생성 후 showinfo2 매서드 만들어서 출력해보기
	// 출력 예 : 2022년 12월 5일, 이름 :(본인이름)
	
	// 해당 맴버의 set/get 만들어서
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 매개변수가 3개인 생성자를 통해서 만들어보기
	public BirthDay(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}	
	// 매개변수 name 추가
	public BirthDay(int day, int month, int year, String name) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.name = name;
	}
	
	// 해당 값을 출력하는 매서드 : showInfo 만들어 보기
	public void showInfo() {
		System.out.println(year + "년 "+ month + "월 " +  day +  "일");
	}
	public void showInfo2() {
		System.
		out.
		println(year + "년 "+ month + "월 " +  day +  "일 , " + "이름 : " + getName());
	}
	
	
	
	
//	public void setYear(int year) {
//		this.year = year;
//	}
//	
//	public void printThis() {
//		System.out.println(this);  //this 출력해보기
//	}
	
}

public class ThisExmaple {

	public static void main(String[] args) {
		
//		BirthDay bDay = new BirthDay();
//		bDay.setYear(2000);
//		System.out.println(bDay);
//		bDay.printThis();
		
		// Birthday의 객체를 하나 생성
		BirthDay bd = new BirthDay(1, 2, 2020);
		// showInfo 출력 해보기
		bd.showInfo();
		
		BirthDay bdn = new BirthDay(5, 12, 2022, "이고잉");
		bdn.showInfo2();
		
		// 이름 변경하기
		bdn.setName("dlrhdld");
		System.out.println();
		System.out.println("showInfo2 호출");
		bdn.showInfo2();
		
			
	}
	
}
