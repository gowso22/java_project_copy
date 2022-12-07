package ch06_staticex_1019;

public class Car {
	
	private static int proNum = 10000;
	int carNum;

	
	public Car() {
		
		proNum++;
		
		carNum = proNum;
		
	}


	public static int getProNum() {
		return proNum;
	}


	public int getCarNum() {
		return carNum;
	}
	
	
	
}
