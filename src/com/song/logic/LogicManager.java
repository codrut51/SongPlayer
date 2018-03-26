package com.song.logic;

public class LogicManager {

	private Notification notification;
	private MusicStreamingServiceApi api;
	
	public LogicManager()
	{
		
	}
	
	public Notification getNotification()
	{
		return notification;
	}
	
	public MusicStreamingServiceApi getStreamingServiceApi()
	{
		return api;
	}
	
}
