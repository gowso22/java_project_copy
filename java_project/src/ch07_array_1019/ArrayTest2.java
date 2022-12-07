package ch07_array_1019;

import ch11_classex_1024.Person;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] data = new double[5];
		String[] data2 = new String[5];
		data2[0] = "lsy";
		Person[] data3 = new Person[5];
		
		for(int i=0; i<data3.length; i++){
			System.out.println(data3[i]);	
		}
		
		for(int i=0; i<data2.length; i++){
			System.out.println(data2[i]);
			
		}
		
		
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
			
		}
	}
}
