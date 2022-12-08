package java_221208;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go () {
		
		run();
		jump();
		turn();
		
	}
	
	
	
	
}
