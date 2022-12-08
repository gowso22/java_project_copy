package ch09_gamelevel_1021;

public class UltimateSkill {
	
	private String skillname;
	private int skillTime;
	private String skillRange;
	
	
	public UltimateSkill(String skillname, int skillTime, String skillRange) {
		super();
		this.skillname = skillname;
		this.skillTime = skillTime;
		this.skillRange = skillRange;
	}
	
	
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public int getSkillTime() {
		return skillTime;
	}
	public void setSkillTime(int skillTime) {
		this.skillTime = skillTime;
	}
	public String getSkillRange() {
		return skillRange;
	}
	public void setSkillRange(String skillRange) {
		this.skillRange = skillRange;
	}
	
	
	public void showSkillInfo() {
		System.out.println("필살기 이름 : " + skillname + " 지속시간 : " + skillTime + " 범위 : " + skillRange);
	}
	
	
	

}
