package ch05_test_1205;

public class FishBreadTest {

	public static void main(String[] args) {
		
		FishBread fb1 = new FishBread();
		// private 접근지정자가 있으므로 직접 접근이 안됨 / set, get으로 접근
		fb1.setPowder("이고잉 기법의 반죽");
		fb1.setRedBean("설탕을 추가한 팥");
		fb1.showInfo();
		System.out.println("붕1의 참조형 변수가 가리키는 값 : " + fb1);
		
		
		FishBread fb2 = new FishBread("빵가루", "설탕과 팥");
		fb2.showInfo();
		System.out.println("붕2의 참조형 변수가 가리키는 값 : " + fb2);
		
		
	}

}
