package ch04_test_1018;


public class IfExample2 {
	public static void main(String[] args) {
		
		int age = 25;
		String g;
		int charge;
		
		if(age < 8){
			charge = 1000; 
			g= "미취학아동";
		}
		else if(age < 14){
			charge = 2000;
			g= "초등학생";
		}
		else if(age < 20){
			charge = 2500;
			g= "중 / 고등학생";
		}
		
		else if(age >= 60) {
			charge = 0;
			g= "경로우대";
		}
		else{
			charge = 3000;
			g= "일반인";
		}
		
		System.out.println(g + " 입니다.");
		System.out.println("입장료는 " + charge + "원입니다.");
		
	}
}
