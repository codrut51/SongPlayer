package com.song;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class PanelControl extends PlayerPanel {

	private CommandButton cmdBtn;
	private ArrayList<String> buttons;
	
	public PanelControl()
	{
		cmdBtn = null;
		System.out.println(cmdBtn);
		buttons = new ArrayList<String>();
		buttons.add("Prev");
		buttons.add("Play");
		buttons.add("Pause");
		buttons.add("Next");
	}

	@Override
	public void createPanel(JFrame f) {
		JPanel p = new JPanel();
		p.setName("Welcome");
		p.setBounds(0, 0, 600, 400);
		f.getContentPane().add(p);
		p.setLayout(null);
		JLabel l = new JLabel("<html><div style='text-align: center;'>" + " The second screen " + "</div></html>");
		l.setBounds(100, 50, 400, 25);
		l.setFont(new Font("Verdana", Font.BOLD, 20));
		p.setBackground(Color.white);
		p.add(l);
		int size = buttons.size();
		for(int i = 0; i < size; i++)
		{
			JButton b = new JButton(buttons.get(i));
			if(i != 0)
			{
				b.setBounds(40 + ((i*110) + (25 * i)), 300, 100, 20);
			}else {
				b.setBounds(40 + (i*110), 300, 100, 20);
			}
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			p.add(b);
		}
		
	}
	
}
