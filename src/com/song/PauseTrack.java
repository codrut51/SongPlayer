package com.song;

import com.song.logic.*;

public class PauseTrack extends CommandButton {
	
	public PauseTrack()
	{
		
	}

	@Override
	public void doAction(LogicManager l) {

		System.out.println("Pausing current track");
	}
	
}
