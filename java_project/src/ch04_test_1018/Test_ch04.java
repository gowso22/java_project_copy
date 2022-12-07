package ch04_test_1018;

public class Test_ch04 {

	public static void main(String[] args) {
		
//	for(int dan = 2; dan <= 9; dan++) {
//			for(int i = 1 ; i <= 9; i++) {
//				if (dan % 2 ==1) 
//					continue; // 홀수 dan이면 출력 x
//				System.out.println(dan + "X" + i + "=" + dan * i);
//			}
//			System.out.println(); // 한 개의 단 끝나면 한 줄 
//		}
//		
//		for(int dan = 2; dan <=9 ; dan++) {
//			for(int i = 1; i <= 9; i++) {
//				if( i > dan)
//					break;
//				System.out.println(dan + "X" + i + "=" + dan * i);
//			}
//			System.out.println(); // 한 개의 단 끝나면 한 줄 
//		}  p.123 for 예제
		
		
		for(int i = 1 ; i <= 7; i++) {
			
			for(int d = 1; d <= i; d++) {
				if(i%2 == 0)
					continue;
				System.out.print("*");
		}
			System.out.println();
		}

		int lineCount = 9;  
		int spaceCount = lineCount/2 +1; // 
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
		
	}//main 닫기
}// class 닫기
