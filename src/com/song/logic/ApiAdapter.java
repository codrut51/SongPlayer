package com.song.logic;

public class ApiAdapter extends MusicStreamingServiceApi {

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
		spotify.play();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		spotify.pause();
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		spotify.previous();
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		spotify.next();
	}

	@Override
	public Song getCurrentSong() {
		// TODO Auto-generated method stub
		return this.current;
	}


	@Override
	protected void setCurrentSong(String url) {
		// TODO Auto-generated method stub
		this.current = spotify.getCurrentSong();
	}
}
