package com.kademika.day8.hw4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Angry implements MouseMotionListener {

	View view;
	Circle circle;
	
	public Angry(View view, Circle circle) {
		this.view = view;
		this.circle = circle;
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		view.getRect().x = e.getX();
		view.getRect().y = e.getY();
		System.out.println(e.getY());
		view.repaint();
	}
	
	
	
}
