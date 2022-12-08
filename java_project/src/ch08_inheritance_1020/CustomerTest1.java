package ch08_inheritance_1020;



public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===============================");
		
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		// 묵시적 형변환 lsy.~ >> 부모클래스만 보임
		Customer lsy = new VIPCustomer(); 
		
		Customer ccc = new Customer();
		
		// 명시적 형변환  lsy7.~ >> 자식클래스와 부모클래스 전부 다 보임
		VIPCustomer lsy7 = (VIPCustomer)ccc; 
		
		
		
	}
}
