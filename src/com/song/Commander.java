package com.song;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.song.logic.MusicPlayer;

public class Commander implements ActionListener{

	private CommandButton cmdBtn;
	private MusicPlayer mp;
	private JLabel l;
	public Commander(CommandButton b)
	{
		this.cmdBtn = b;
		mp = new MusicPlayer();
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
	}
	
	private void updateView()
	{
		//set string
		l.setText(mp.getStreamingServiceApi().getCurrentSong().getDetails());
	}
	
}
