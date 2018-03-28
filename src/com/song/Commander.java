package com.song;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.song.logic.LogicManager;

public class Commander implements ActionListener{

	private CommandButton cmdBtn;
	private LogicManager manager;
	public Commander(CommandButton b)
	{
		this.cmdBtn = b;
		manager = new LogicManager();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		cmdBtn.doAction(manager);
	}

	
}
