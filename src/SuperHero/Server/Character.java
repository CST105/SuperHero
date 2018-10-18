package SuperHero.Server;

public abstract class Character {
	
	// Class attributes
	// Each character has 4 powers
	private String [] powers = new String[4];
	protected int friendability = 1;
	
	// Class getter / setters
	public void setPowers(String x, int i) {
		this.powers[i] = x;
	}
	
	public String getPowers(int i) {
		return this.powers[i];
	}
	
	public int getFriendability() {
		return this.friendability;
	}	
	
	// Class DEFINED methods and behaviors
	public String [] getAllPowers() {
		return this.powers;
	}
	
	// Class ABSTRACT methods and behaviors
	public abstract void setFriendability(int i); 	
	public abstract void performPower(int i);
	public abstract boolean playWithOthers();	

}
