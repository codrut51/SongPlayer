package com.song.logic;


public class XMLSpotify extends SpotifyMusicApi{

	public XMLSpotify()
	{
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Song getCurrentSong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setCurrentSong() {
		// TODO Auto-generated method stub
		this.current = new Song("Can't touch this","Anonymous","https://cdns-preview-e.dzcdn.net/stream/c-e8d3b8e06c36a765eb4e6f3cb942ed6e-2.mp3", null, null);
	}

}
