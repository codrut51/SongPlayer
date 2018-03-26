package com.song.logic;

public class AlarmNotification extends WatchNotification {

	public AlarmNotification()
	{
		
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.notify.setNotification("This is a very important Alarm Notification ");
	}

}
