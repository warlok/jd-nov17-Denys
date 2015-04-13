package com.kademika.day8.hw4;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JPanel;

public class Circle {

	private int x = 100;
	private int y = 100;
	private int diamX = 100;
	private int diamY = 100;
	private Shape shape;

	public Circle() {
		shape = new Ellipse2D.Float(x, y, diamX, diamY);
	}
	
	public Circle(int x, int y, int diamX, int diamY) {
		super();
		this.x = x;
		this.y = y;
		this.diamX = diamX;
		this.diamY = diamY;
	}

	public void intersseption() {
		Random rand = new Random();
		x = rand.nextInt(750);
		y = rand.nextInt(550);
		shape = new Ellipse2D.Float(x, y, diamX, diamY);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiamX() {
		return diamX;
	}

	public void setDiamX(int diamX) {
		this.diamX = diamX;
	}

	public int getDiamY() {
		return diamY;
	}

	public void setDiamY(int diamY) {
		this.diamY = diamY;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
}
