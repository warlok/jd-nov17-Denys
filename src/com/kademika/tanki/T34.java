package com.kademika.tanki;

public class T34 extends AbstractTank {


	public T34(ActionField af, BattleField bf) {
		super(af,bf);
		colorTank = new java.awt.Color(0, 255, 0);
		colorTower = new java.awt.Color(255,0, 0);
	}

	public T34(ActionField af, BattleField bf, int x, int y, Direction direction) {
		super(af,bf,x,y,direction);
		colorTank = new java.awt.Color(0, 255, 0);
		colorTower = new java.awt.Color(255,0, 0);
	}

}
