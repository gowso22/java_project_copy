package java_221209;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담워에게 배분하비낟.");
	}

}
