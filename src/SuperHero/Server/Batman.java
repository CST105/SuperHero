package SuperHero.Server;

public class Batman extends Character implements fight,heal {

	@Override
	public void performPower(int i) {
		System.out.println("Batman is now performing his " + this.getPowers(i) + " power!");
		
	}

	@Override	
	public void setFriendability(int i) {
		this.friendability = this.friendability  + i;
		
	}
	
	@Override
	public boolean playWithOthers() {
		if (this.getFriendability() > 15) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int superPunch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sneakSmack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int normalHit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int superHeal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sneakHeal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int normalHeal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
