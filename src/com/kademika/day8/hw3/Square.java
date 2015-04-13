package com.kademika.day8.hw3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kademika.day8.frame16.Animal;
import com.kademika.day8.frame16.Customer;

public class Square extends JPanel {

	
    public Square() {
        JFrame frame = new JFrame("HW3");
        this.setLayout(new GridBagLayout());
        frame.setContentPane(this);
		frame.setBounds(300, 300, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
		MouseListener l = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				repaint();
				
			}
		};
		
		frame.addMouseListener(l);
		
		
    
    }
    
    @Override
	public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	Random r = new Random();
    	g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
    	g.fillRect(300, 200, 200, 200);
	}
    
}
