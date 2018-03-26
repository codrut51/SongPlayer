package com.song;

import com.song.logic.*;

public class PlayNextTrack extends CommandButton {

	public PlayNextTrack()
	{
		
	}
	
	@Override
	public void doAction(LogicManager l) {

		System.out.println("Playing next track");
	}

}
