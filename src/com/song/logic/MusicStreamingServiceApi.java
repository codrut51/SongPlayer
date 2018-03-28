package com.song.logic;

public abstract class MusicStreamingServiceApi {

	protected Song current;
	public abstract void play();
	public abstract void pause();
	public abstract void previous();
	public abstract void next();
	public abstract Song getCurrentSong();
	protected abstract void setCurrentSong(String url);
}
