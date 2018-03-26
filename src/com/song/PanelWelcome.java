package com.song;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelWelcome extends PlayerPanel {

	public PanelWelcome()
	{
		
	}

	@Override
	public void createPanel(JFrame f) {
		JPanel p = new JPanel();
		p.setBounds(0, 0, 600, 400);
		p.setName("Welcome");
		f.getContentPane().add(p);
		p.setLayout(null);
		togleControlVisible(f);
		JLabel l = new JLabel("<html><div style='text-align: center;'>" + "Welcome to Deezer Song Player!" + "</div></html>");
		l.setBounds(100, 50, 400, 25);
		l.setFont(new Font("Verdana", Font.BOLD, 20));
		JButton b = new JButton("Next");
		b.setBounds(250, 125, 100, 25);
		b.setFont(new Font("Verdana", Font.BOLD, 20));
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				p.setVisible(false);
				togleControlVisible(f);
			}
			
		});
		p.setBackground(Color.white);
		p.add(l);
		p.add(b);
	}
	
	private void togleControlVisible(JFrame f)
	{
		Component[] comps = f.getContentPane().getComponents();
		for(Component comp : comps)
		{
			if(comp.getName() != null)
			{
				if(comp.getName().equals("Control"))
				{
					if(comp.isVisible())
					{
						comp.setVisible(false);
					} else { 
						comp.setVisible(true);
					}
				}
			}
		}
	}
}
