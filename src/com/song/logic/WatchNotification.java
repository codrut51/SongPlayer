package com.song.logic;

public abstract class WatchNotification {

	protected Notification notify = new Notification();
	protected MusicStreamingServiceApi api;
	
	public abstract void update();
}
