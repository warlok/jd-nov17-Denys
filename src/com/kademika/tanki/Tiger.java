package com.kademika.tanki;

public class Tiger extends AbstractTank {

	private int armor;
	
	public Tiger(ActionField af, BattleField bf) {
		super(af,bf);
		colorTank = new java.awt.Color(255, 0, 0);
		colorTower = new java.awt.Color(0,255, 0);
		armor=1;
	}

	public Tiger(ActionField af, BattleField bf, int x, int y, Direction direction) {
		super(af,bf,x,y,direction);
		colorTank = new java.awt.Color(255, 0, 0);
		colorTower = new java.awt.Color(0,255, 0);
		armor=1;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}


}
