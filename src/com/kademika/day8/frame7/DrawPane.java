package com.kademika.day8.frame7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPane extends JPanel {

	
	public static void main(String[] args) {
	new DrawPane();
	}
	
	public DrawPane() {
		JFrame frame = new JFrame("TEST");
//		frame.setLocation(300, 100);
//		frame.setMinimumSize(new Dimension(800, 600));
//		frame.getContentPane().add(this);
		frame.setContentPane(this);
		frame.setBounds(300, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		repaint();
	}
	
	
@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(new Color(255, 0, 0));
	g.fillRect(0, 0, 8000, 6000);
}
	
}
