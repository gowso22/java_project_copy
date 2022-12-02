package ch04_test_1018;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		String medal = in.next();
		
		// int ranking = in.nextInt();
		char medalColor;
		
		switch(medal){
		
			case "gold": medalColor = 'G';
				break;
				
			case "silver" : medalColor = 'S';
				break;
			
			case "bronze" : medalColor = 'B';
				break;
			default:
				medalColor = 'x';
		}
		
		System.out.println(medal + "의 메달의 색깔은 " + medalColor + " 입니다.");
	}
}
