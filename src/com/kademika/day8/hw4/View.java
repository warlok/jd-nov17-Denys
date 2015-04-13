package com.kademika.day8.hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class View extends JPanel {

	Circle circle;
	Rectangle rect = new Rectangle(0, 0, 10, 10);
	
	public View(Circle circle) {
		this.circle = circle;
		paint();
	}
	
	public void paint() {
		JFrame frame = new JFrame();
		MouseMotionListener l = new Angry(this, circle);
		frame.addMouseMotionListener(l);
		frame.setBounds(300, 100, 800, 600);
		frame.setContentPane(this);
		frame.setVisible(true);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255, 0, 0));
		g2d.fillRect(rect.x, rect.y, 1, 1);
		g2d.fillOval(circle.getX(), circle.getY(), circle.getDiamX(), circle.getDiamY());
		if (g2d.hit(rect, circle.getShape(), false)) {
			circle.intersseption();
		}
	}

	public Rectangle getRect() {
		return rect;
	}
}
