package java_221208;

public class Player {
	
	private PlayerLevel level;

	public Player() {
		super();
		this.level = new BeginnerLevel();
		
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		
		this.level = level;
		
		level.showLevelMessage();
		
		
	}
	public void play() {
		level.go();
	}
	

	
		

}
