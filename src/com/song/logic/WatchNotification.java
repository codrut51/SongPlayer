package com.song.logic;

public abstract class WatchNotification {

	protected Notifier notify = new Notifier();
	protected MusicStreamingServiceApi api;
	
	public abstract void update();
}
