package com.kademika.tanki;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AbstractTank implements Destroyable,Drawable {

	protected Color colorTank;
	protected Color colorTower;
	protected int speed = 10;
	protected int x;
	protected int y;
	protected Direction direction;
	protected ActionField af;
	protected BattleField bf;
	

	public AbstractTank(ActionField af, BattleField bf) {
		this.af = af;
		this.bf = bf;
	}

	public AbstractTank(ActionField af, BattleField bf, int x, int y,
			Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public Color getColorTank() {
		return colorTank;
	}

	public void setColorTank(Color colorTank) {
		this.colorTank = colorTank;
	}

	public Color getColorTower() {
		return colorTower;
	}

	public void setColorTower(Color colorTower) {
		this.colorTower = colorTower;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
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

	public void turn(Direction direction) throws Exception {
		if (!this.direction.equals(direction)) {
			this.direction = direction;
			af.processTurn(this);
		}
	}

	public void move() throws Exception {
		af.processMove(this);
	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet(x + 25, y + 25, direction);
		af.processFire(bullet);
	}

	public void destroy() /* throws Exception */{
		x = -100;
		y = -100;
		// Thread.sleep(3000);
		// af.processDestroy(this);
	}

	public void moveToQuadrant(int v, int h) throws Exception {

		int newY = (v - 1) * 64;
		int newX = (h - 1) * 64;
		af.proccessmoveToQuadrant(this, newX, newY);

	}
	
	public void draw(Graphics g) {
		
		Color tankColor = this.getColorTank();
		Color towerColor = this.getColorTower();
		
		g.setColor(tankColor);
		g.fillRect(this.getX(), this.getY(), 64, 64);

		g.setColor(towerColor);
		if (this.getDirection() == Direction.UP) {
			g.fillRect(this.getX() + 20, this.getY(), 24, 34);
		} else if (this.getDirection() == Direction.DOWN) {
			g.fillRect(this.getX() + 20, this.getY() + 30, 24, 34);
		} else if (this.getDirection() == Direction.LEFT) {
			g.fillRect(this.getX(), this.getY() + 20, 34, 24);
		} else {
			g.fillRect(this.getX() + 30, this.getY() + 20, 34, 24);
		}
	}

	 public void clean() throws Exception {
	
	 af.processClean(this);
	
	 }

	public void moveRandom() throws Exception {

		af.proccessMoveRandom(this);

	}

}
