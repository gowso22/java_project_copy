package ch06_cooperation_1019;

public class KakaoTaxi {

	 int taxiNum;             
	 int passengerCount;       
	 int money;                 
	    
	 public KakaoTaxi(int taxiNum)   
	 {   
		 this.taxiNum = taxiNum;
	 }
	
	 public void take(int money)   
	 {  
		  this.money += money;    
		  passengerCount++;      
	 }
	    
	 public void showInfo() {      
		  System.out.println("택시 번호판 " + taxiNum + "의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
	 }


	
}
