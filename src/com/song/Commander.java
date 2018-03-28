package com.song;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.song.logic.MusicPlayer;

public class Commander implements ActionListener{

	private Command cmdBtn;
	private MusicPlayer mp;
	private JLabel l;
	public Commander(Command b, MusicPlayer mp)
	{
		this.cmdBtn = b;
		this.mp = mp;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		cmdBtn.doAction(mp);
		updateView();
	}

	public void setView(JLabel l)
	{
		this.l = l;
		updateView();
	}
	
	private void updateView()
	{
		//set string
		l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
	}
	
}
