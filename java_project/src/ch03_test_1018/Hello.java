package ch03_test_1018;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello 이상용 자바!");
		/* 여러행 주석은 ctrl + shift + / */
		// 포맷 정렬 ctrl + shift + f
		
		char ch1 = '\uD55B';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		 
		Scanner in =  new Scanner(System.in);
		
		int age = in.nextInt();
		
		System.out.println("나이 " + age);
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
