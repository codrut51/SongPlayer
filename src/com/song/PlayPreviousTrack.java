package com.song;


import com.song.logic.*;

public class PlayPreviousTrack extends Command {

	public PlayPreviousTrack()
	{
		
	}

	@Override
	public void doAction(MusicStreamingServiceApi l) {
		l.previous();
	}

	
}
