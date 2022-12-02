package ch2_1017;

public class Variable1 {

	public static void main(String[] args) {

		int level;      //정수형 변수 level을 선언
		level = 10;		//level 변수에 10을 대입
		
		byte b1 = 12;
		
		System.out.println(b1);
		System.out.println(level); 
		
		System.out.println("test");
		
		int i1 = b1;
		byte b2 = (byte)i1; // () 소괄호는 의미는 캐스팅 연산자라고 함. 명시적, 강제적 형변환
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
		
	}

}
