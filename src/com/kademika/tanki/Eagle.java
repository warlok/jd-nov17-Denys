package com.kademika.tanki;

import java.awt.Color;
import java.awt.Graphics;

public class Eagle extends AbstractObjects implements Destroyable {


	public Eagle(int x, int y) {
		color = new Color(255, 255, 0);
		this.x = x;
		this.y = y;
	}

}
