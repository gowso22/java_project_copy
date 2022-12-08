package ch09_gamelevel_1021;

public class UltraLevel extends PlayerLevel{

	
	
	
	@Override
	public void run() {
		System.out.println("엄청 매우 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 더 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");		
	}
	@Override
	public void attack() {
		System.out.println("attack 함.");
	}
	
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** Ultra 레벨 입니다. *****");
	}
	
	
	

}
