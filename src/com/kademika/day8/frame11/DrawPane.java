package com.kademika.day8.frame11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
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
	g.setColor(new Color(0, 255, 0));
	g.setFont(new Font("Dean", Font.ITALIC, 16));
	g.drawString("Denis is a GREAT man!!!", 100, 200);
	
}
	
}
