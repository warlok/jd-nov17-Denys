package com.kademika.tanki;

import java.util.Random;

public class Tank {

//	private int maxSpeed=10;
//	
//	public int getMaxSpeed() {
//		return maxSpeed;
//	}
//
//	public void setMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//	}


	protected int speed=10;
	protected int x;
	protected int y;
	protected Direction direction;
	protected ActionField af;
	protected BattleField bf;

	
	public Tank(ActionField af, BattleField bf) {
		this.af = af;
		this.bf = bf;
	}

	public Tank(ActionField af, BattleField bf, int x, int y, Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x=x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getSpeed() {
		return speed;
	}

	public Direction getDirection() {
		return direction;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

//	public void turn(Direction direction) throws Exception {
//		if (!this.direction.equals(direction)) {
//			this.direction = direction;
//			af.processTurn(this);
//		}
//	}
//
//	public void move() throws Exception {
//		af.processMove(this);
//	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet(x+25,y+25,direction);
		af.processFire(bullet);
	}
	
	public void destroy() /*throws Exception*/ {
		x=-100;
		y=-100;
//		Thread.sleep(3000);
//		af.processDestroy(this);
	}

//	public void moveRandom() throws Exception {
//		
//		af.proccessMoveRandom(this);
//	
//	}
//
//	public void moveToQuadrant(int v, int h) throws Exception {
//		
//		int newY = (v-1)*64;
//		int newX = (h-1)*64;
//		af.proccessmoveToQuadrant(this, newX, newY);
//		
//	}
//	
//	
//	public void clean() throws Exception {
//
//		af.processClean(this);
//		
//	}

}
