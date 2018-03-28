package com.song;

import com.song.logic.*;

public class PauseTrack extends Command {
	
	public PauseTrack()
	{
		
	}

	@Override
	public void doAction(MusicPlayer l) {

		l.getStreamingServiceApi().pause();
	}
	
}
