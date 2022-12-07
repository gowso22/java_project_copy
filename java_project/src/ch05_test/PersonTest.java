package ch05_test;

public class PersonTest {
   
	 public static void main(String[] args) {
		 
		  Person sch = new Person();
		 // sch.name = "이고잉";
		  sch.height = 155F;
		  sch.weight = 55F;
		  // set 이용해서 name 값 설정하기.
		  sch.setName("setter로 이고잉 추가");
		  
		  System.out.println
		  ("get매서드로 이름 호출 : " + sch.getName());
		  
		  
		  Person sch2 = new Person("삼고잉");
		  Person sch3 = new Person("사고잉", 145F, 45F);

		 /* personKim.name = "김유신";
		  personKim.weight = 85.5F;
		  personKim.height = 180.0F;
		
		  Person personLee = new Person("이순신", 175, 75);
		  */
		  
		  sch.showInfo();
		
		  sch2.showInfo();
		  sch3.showInfo();
		  
	 }
}
