package com.song;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.song.logic.MusicPlayer;

public class Commander implements ActionListener{

	private CommandButton cmdBtn;
	private MusicPlayer manager;
	private JLabel l;
	public Commander(CommandButton b)
	{
		this.cmdBtn = b;
		manager = new MusicPlayer();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		cmdBtn.doAction(manager);
	}

	public void setView(JLabel l)
	{
		this.l = l;
	}
	
	public void updateView()
	{
		//set string
	}
	
}
