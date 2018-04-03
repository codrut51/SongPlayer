package com.song.logic;

public class AlarmNotification extends WatchNotification {

	public AlarmNotification(Notifier n)
	{

		this.notify = n;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.notify.setNotification("This is a very important Alarm Notification ");
	}

}
