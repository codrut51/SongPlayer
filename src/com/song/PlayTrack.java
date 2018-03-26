package com.song;

import com.song.logic.*;

public class PlayTrack extends CommandButton {

	public PlayTrack()
	{
		
	}

	@Override
	public void doAction(LogicManager l) {

		System.out.println("Playing current track");
	}
	
}
