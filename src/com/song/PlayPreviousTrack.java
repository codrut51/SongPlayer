package com.song;


import com.song.logic.*;

public class PlayPreviousTrack extends CommandButton {

	public PlayPreviousTrack()
	{
		
	}

	@Override
	public void doAction(MusicPlayer l) {
		System.out.println("Playing previous track");
	}

	
}
