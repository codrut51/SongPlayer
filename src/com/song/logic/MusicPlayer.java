package com.song.logic;

import com.song.Command;

public class MusicPlayer {

	private Notifier notification;
	private MusicStreamingServiceApi api;
	public MusicPlayer()
	{
		notification = new Notifier();
		notification.attach(new AlarmNotification(notification));
		notification.attach(new NewsNotification(notification));
		api = new DeezerMusicApi("json");
	}
	
	public Notifier getNotification()
	{
		notification.notifyAllObservers();
		return notification;
	}
	
	public MusicStreamingServiceApi getStreamingServiceApi()
	{
		return api;
	}
	
	public void executeCommand(Command cmd)
	{
		cmd.doAction(api);
	}
}
