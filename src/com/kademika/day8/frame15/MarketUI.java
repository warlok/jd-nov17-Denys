package com.kademika.day8.frame15;

import java.awt.Dimension;
import java.awt.Graphics;

//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JList;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JRadioButtonMenuItem;
//import javax.swing.JTextArea;
import javax.swing.*;

public class MarketUI extends JPanel {

	public MarketUI() {

		JFrame frame = new JFrame("Petshop");
		frame.setBounds(350, 50, 300, 500);
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lable = new JLabel("Customer's Name:");
		JTextField text = new JTextField(10);
		String[] petStrings = { "newt", "aligator", "frog", "boa", "sunfish",
				"parrot", "owl", "tiger", "rabbit", "raccoon", "penguin",
				"chameleon", "iguana" };
		JComboBox petList = new JComboBox(petStrings);
		petList.setMaximumRowCount(5);
		JLabel amountLable = new JLabel("Input Amount:");
		JTextField amountAnimals = new JTextField(2);
		JButton button = new JButton("Add");
		JButton buy = new JButton("BUY");
		JLabel lablePetsList = new JLabel("Choose an Animal:");
		this.add(lable);
		this.add(text);
		this.add(lablePetsList);
		this.add(petList);
		this.add(amountLable);
		this.add(amountAnimals);
		this.add(button);
		this.add(buy);
		// frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MarketUI();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
	}

}
