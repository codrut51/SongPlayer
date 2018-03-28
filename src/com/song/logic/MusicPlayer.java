package com.song.logic;

public class MusicPlayer {

	private Notifier notification;
	private MusicStreamingServiceApi api;
	
	public MusicPlayer()
	{
		notification = new Notifier();
		api = new DeezerMusicApi("json");
	}
	
	public Notifier getNotification()
	{
		return notification;
	}
	
	public MusicStreamingServiceApi getStreamingServiceApi()
	{
		return api;
	}
	
}
