package com.song;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;

import com.song.logic.MusicPlayer;

public class PanelControl extends PlayerPanel {

	private ArrayList<Commander> cmdbtns;
	private ArrayList<String> buttons;
	
	public PanelControl()
	{

		MusicPlayer mp = new MusicPlayer();
		cmdbtns = new ArrayList<Commander>();
		cmdbtns.add(new Commander(new PlayPreviousTrack(), mp));
		cmdbtns.add(new Commander(new PlayTrack(), mp));
		cmdbtns.add(new Commander(new PauseTrack(), mp));
		cmdbtns.add(new Commander(new PlayNextTrack(), mp));
		buttons = new ArrayList<String>();
		buttons.add("Prev");
		buttons.add("Play");
		buttons.add("Pause");
		buttons.add("Next");
	}

	@Override
	public void createPanel(JFrame f) {
		JPanel p = new JPanel();
		p.setName("Control");
		p.setBounds(0, 0, 800, 400);
		f.getContentPane().add(p);
		p.setLayout(null);
		JLabel l = new JLabel("<html><div style='text-align: center;'>" + " The second screen " + "</div></html>");
		//l.setBounds(100, 50, 400, 25);
		l.setLocation(100, 50);
		l.setSize(700,50);
		//l.setHorizontalAlignment(JLabel.CENTER);
		l.setVerticalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("Verdana", Font.BOLD, 14));
		p.setBackground(Color.white);
		p.add(l);
		int size = buttons.size();
		for(int i = 0; i < size; i++)
		{
			JButton b = new JButton(buttons.get(i));
			if(i != 0)
			{
				b.setBounds(100 + ((i*110) + (50 * i)), 300, 100, 20);
			}else {
				b.setBounds(100 + (i*110), 300, 100, 20);
			}
			b.addActionListener(cmdbtns.get(i));
			cmdbtns.get(i).setView(l);
			p.add(b);
		}
		
	}
}
