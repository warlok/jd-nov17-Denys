package com.kademika.day8.frame9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPane extends JPanel {

	private final static String imagea = "Rivne.png";
	private Image img;
	
	public static void main(String[] args) throws Exception {
	new DrawPane();
	}
	
	public DrawPane() throws Exception {
		img = ImageIO.read(new File(imagea));
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
	g.drawImage(img, 300, 0, new ImageObserver() {
			
		@Override
		public boolean imageUpdate(Image img, int infoflags, int x, int y,
				int width, int height) {
			// TODO Auto-generated method stub
			return false;
		}
	});
	
}
	
}
