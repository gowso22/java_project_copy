package ch05_test_1205;

public class FishBread {
	
	private String powder;
	private String redBean;
	
	//실제 데이터에 접근을 하는 방법 : 직접 접근(직접접근개체명.), setter/getter 메서드
	
	public String getPowder() {
		return powder;
	}
	public void setPowder(String powder) {
		this.powder = powder;
	}
	public String getRedBean() {
		return redBean;
	}
	public void setRedBean(String redBean) {
		this.redBean = redBean;
	}
	
	public void showInfo() {
		
		System.out.println("현재 반죽은 : " + powder);
		System.out.println("현재 팥은 : " + redBean);
		
	}
	
	// 기본 생성자는 JVM이 자동으로 만들어줌. 
	// 조건)해당 생성자(Constructor)가 하나도 없을 경우
	// 오버로드 => 매개변수가 2개인 생성자를 만들기.
	
	public FishBread(String powder, String redBean) {
		//super : 상속이라는 개념을 통해서 부모 클래스/상위 클래스를 호출할 때 사용하는 키워드(초기화 역할)
		super();
		
		this.powder = powder;
		this.redBean = redBean;
	}	
	
	// 매개변수가 없는 기본 생성자 만들어줌.
	public FishBread() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
