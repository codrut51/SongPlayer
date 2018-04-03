package com.song;

public class CommandFactory {


	public CommandFactory()
	{
		
	}
	
	public Command getCommand(String command)
	{
		if(command != null)
		{
			if(command.equals("Next"))
			{
				return new PlayNextTrack();
			} 
			else if(command.equals("Play")) 
			{
				return new PlayTrack();
			}else if(command.equals("Pause"))
			{
				return new PauseTrack();
			}else if(command.equals("Prev")){
				return new PlayPreviousTrack();
			}
		}
		return null;
	}
}
