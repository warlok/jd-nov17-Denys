package com.kademika.tanki;

import java.awt.Color;
import java.awt.Graphics;

public class Rock extends AbstractObjects implements Destroyable {

	
	
	public Rock(int x, int y) {
	color = new Color(153, 102, 0);
	this.x = x;
	this.y = y;
	}
	
}
