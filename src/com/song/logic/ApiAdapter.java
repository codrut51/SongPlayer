package com.song.logic;

public class ApiAdapter implements MusicStreamingServiceApi {

	private SpotifyMusicApi spotify;
	public ApiAdapter(String method)
	{
		if(method.equals("XML"))
		{
			spotify = new XMLSpotify();
		} else if(method.equals("Yaml")) {
			spotify = new YAMLSpotify();
		}
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
}
