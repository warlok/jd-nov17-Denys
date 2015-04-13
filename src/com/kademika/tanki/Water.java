package com.kademika.tanki;

import java.awt.Color;
import java.awt.Graphics;

public class Water extends AbstractObjects {

	public Water(int x, int y) {
	color = new Color(0, 0, 255);
	this.x = x;
	this.y = y;
	}
	
	public void destroy() {
	}
	
}
