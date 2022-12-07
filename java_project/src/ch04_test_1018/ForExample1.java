package ch04_test_1018;

public class ForExample1 {
	public static void main(String[] args) {

		int i;
		int sum;
		for(i=0, sum=0; i<=10; i++){
			System.out.println("i : " + i);
			sum += i;
			
			System.out.println("sum : " + sum);
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
