package com.song;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class PanelControl extends PlayerPanel {

	private CommandButton cmdBtn;
	
	public PanelControl()
	{
		cmdBtn = null;
		System.out.println(cmdBtn);
	}

	@Override
	public JPanel createPanel(JFrame f) {
		JPanel p = new JPanel();
		p.setName("Control");
		p.setLayout(null);
		JLabel l1 = new JLabel("<html><div style='text-align: center;'>" + "Fuuuuuuck offff!" + "</div></html>");
		l1.setBounds(100, 50, 400, 25);
		l1.setFont(new Font("Verdana", Font.BOLD, 20));
		p.setBackground(Color.white);
		p.add(l1);
		return p;
	}
	
}
