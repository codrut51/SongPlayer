package com.song;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.song.logic.MusicPlayer;

public class PanelControl extends PlayerPanel {

	public PanelControl()
	{
	}

	@Override
	public void createPanel(JFrame f) {
		MusicPlayer mp = new MusicPlayer();
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
		l.setFont(new Font("Comic Sans", Font.BOLD, 14));
		p.setBackground(Color.white);
		p.add(l);
		CommandFactory cf = new CommandFactory(); 
		JLabel l1 = new JLabel();
		//l.setBounds(100, 50, 400, 25);
		l1.setLocation(100, 100);
		l1.setSize(700,50);
		//l.setHorizontalAlignment(JLabel.CENTER);
		l1.setVerticalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Verdana", Font.BOLD, 14));
		p.setBackground(Color.white);
		p.add(l1);
		l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
		JButton prev = new JButton("prev");
		prev.setBounds(100, 200, 100, 20);
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Command c = cf.getCommand("Prev");
				mp.executeCommand(c);
				l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
				l1.setText(mp.getNotification().getNotification());
			}
		});
		p.add(prev);
		JButton play = new JButton("play");
		play.setBounds(250, 200, 100, 20);
		play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Command c = cf.getCommand("Play");
				mp.executeCommand(c);
				l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
				l1.setText(mp.getNotification().getNotification());
			}
		});
		p.add(play);
		JButton pause = new JButton("pause");
		pause.setBounds(400, 200, 100, 20);
		pause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Command c = cf.getCommand("Pause");
				mp.executeCommand(c);
				l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
				l1.setText(mp.getNotification().getNotification());
			}
		});
		p.add(pause);
		JButton next = new JButton("next");
		next.setBounds(550, 200, 100, 20);
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Command c = cf.getCommand("Next");
				mp.executeCommand(c);
				l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
				l1.setText(mp.getNotification().getNotification());
			}
		});
		p.add(next);
		
	}
}
