package com.song.logic;


import javazoom.jl.player.advanced.AdvancedPlayer;

public class YAMLSpotify extends SpotifyMusicApi{

	private AdvancedPlayer player = null;
	private Thread t;
	private ApiAdapter adapter = null;
	private boolean isPlaying;
	private boolean isPaused;
	public YAMLSpotify() {
		isPlaying = false;
		isPaused = false;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub

		if(adapter == null)
		{
	        if (player != null) 
	        {
	        	if(!isPlaying && !isPaused)
	        	{
		        	t = new Thread(new Runnable() {
		
						@Override
						public void run() {
				            try {
								player.play();
								isPlaying = true;
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				        }        		
		        	});
		        	t.start();
	        	}else if(isPaused) 
	        	{
	        		t.notify();
	        	}
	        	
	        }
		}else {
			adapter.play();
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		try {
			t.wait();
			isPaused = true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(adapter == null)
		{
		}else {
			adapter.play();
		}
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		isPaused = false;
		isPlaying = false;
		t.interrupt();
		setCurrentSong();
		if(adapter == null)
		{
		}else {
			adapter.play();
		}
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		isPaused = false;
		isPlaying = false;
		t.interrupt();
		setCurrentSong();
		if(adapter == null)
		{
		}else {
			adapter.play();
		}
	}

	@Override
	public Song getCurrentSong() {
		// TODO Auto-generated method stub
		if(adapter == null)
		{
			return this.current;
		}else {
			return adapter.getCurrentSong();
		}
	}

	@Override
	protected void setCurrentSong() {
		// TODO Auto-generated method stub
		this.current = new Song("Can't touch this","Anonymous","https://cdns-preview-e.dzcdn.net/stream/c-e8d3b8e06c36a765eb4e6f3cb942ed6e-2.mp3", null, null);
	}

}
