package com.kademika.tanki;

import java.awt.Color;
import java.awt.Graphics;

public class Brick extends AbstractObjects implements Destroyable {

	public Brick(int x, int y) {
	color = new Color(255, 51, 153);
	this.x = x;
	this.y = y;
	}

}
