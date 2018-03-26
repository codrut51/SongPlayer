package com.song.logic;

public class NewsNotification extends WatchNotification {
	
	public NewsNotification()
	{
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.notify.setNotification("This is a really important News Notification");
	}

}
