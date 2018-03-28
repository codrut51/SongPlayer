package com.song.logic;

import java.util.ArrayList;

public class Notifier {
	private ArrayList<WatchNotification> observers;
	private String notification;
	public Notifier()
	{
		observers = new ArrayList<WatchNotification>();
		notification = "No news";
	}
	
	public String getNotification()
	{
		return notification;
	}
	
	public void setNotification(String notification)
	{
		this.notification = notification;
	}

	public void attach(WatchNotification obs)
	{
		observers.add(obs);
	}
	
	public void notifyAllObservers()
	{
		for(WatchNotification observer : observers)
		{
			observer.update();
		}
	}
}
