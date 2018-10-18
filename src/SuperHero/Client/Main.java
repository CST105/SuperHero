package SuperHero.Client;

import SuperHero.Server.Batman;
import SuperHero.Server.Superman;

public class Main {
	
	private void createSuperman() {
		Superman man = new Superman();
		man.setPowers("X-Ray vision", 0);
		man.setPowers("super strength", 1);
		man.setPowers("flight", 2);
		man.setPowers("leaping tall building", 3);	
		man.performPower(3);
		
		man.setFriendability(7);
		System.out.println("Superman friendability = " + man.getFriendability());		
		if (man.playWithOthers()) {
			System.out.println("Superman is a team player!");
		}
		else {
			System.out.println("Superman is a loner!");			
		}
	}
	
	private void createBatman() {
		Batman bat = new Batman();
		bat.setPowers("bat grappling hook", 0);
		bat.setPowers("bat fu", 1);
		bat.setPowers("bat flight", 2);
		bat.setPowers("bat kapowie", 3);	
		bat.performPower(2);
		
		bat.setFriendability(9);
		System.out.println("Batman friendability = " + bat.getFriendability());
		if (bat.playWithOthers()) {
			System.out.println("Batman is an asset to the Super Friends!");
		}
		else {
			System.out.println("Batman is a loner!");			
		}		
	}

	public static void main(String[] args) {

		Main m = new Main();
		m.createSuperman();
		m.createBatman();
		
		
	}

}
