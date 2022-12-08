package java_221208;

public class MainBoard {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play();
		
		AdvancedLevel adLevel = new AdvancedLevel();
		SuperLevel suLevel = new SuperLevel();
		
		player.upgradeLevel(suLevel);
		player.upgradeLevel(adLevel);
		player.play();
		
		player.upgradeLevel(adLevel);
		player.play();
		
		
		
	}

}
