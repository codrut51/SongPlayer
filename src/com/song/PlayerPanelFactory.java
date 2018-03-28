package com.song;

public class PlayerPanelFactory {

	public PlayerPanelFactory()
	{
		
	}
	
	public PlayerPanel getGetPlayerPanel(String panelTitle)
	{
		if(panelTitle != null)
		{
			if(panelTitle.equals("Welcome"))
			{
				return new PanelWelcome();
			} 
			else if(panelTitle.equals("Control")) 
			{
				return new PanelControl();
			}
		}
		return null;
	}
	

	public Command getCommand(String command)
	{
		if(command != null)
		{
			if(command.equals("PlayNext"))
			{
				return new PlayNextTrack();
			} 
			else if(command.equals("Play")) 
			{
				return new PlayTrack();
			}
		}
		return null;
	}
	
}
