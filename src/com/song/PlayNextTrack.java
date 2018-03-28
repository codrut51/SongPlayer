package com.song;

import com.song.logic.*;

public class PlayNextTrack extends Command {

	public PlayNextTrack()
	{
		
	}
	
	@Override
	public void doAction(MusicPlayer l) {

		l.getStreamingServiceApi().next();
	}

}
