package com.song;

import com.song.logic.*;

public class PlayTrack extends Command {

	public PlayTrack()
	{
		
	}

	@Override
	public void doAction(MusicPlayer l) {
		l.getStreamingServiceApi().play();
	}
	
}
