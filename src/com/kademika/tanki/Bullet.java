package com.kademika.tanki;

import java.awt.Color;
import java.awt.Graphics;

//import com.kademika.lesson4.BattleField;

public class Bullet implements Destroyable,Drawable {

	private int x;
	private int y;
	private int speed = 1;
	private Direction direction;

	public Bullet(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void updateX(int bulletX) {
		x += bulletX;
	}

	public void updateY(int bulletY) {
		y += bulletY;
	}

	public int getBulletX() {
		return x;
	}

	public int getBulletY() {
		return y;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public Direction getDirection() {
		return direction;
	}

	public void destroy() {
		x = -100;
		y = -100;
	}
	
	public void draw(Graphics g) {
		g.setColor(new Color(255, 255, 0));
		g.fillRect(this.getBulletX(), this.getBulletY(), 14, 14);
	}

}
