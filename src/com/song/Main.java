package com.song;

import com.song.logic.DeezerMusicApi;

public class Main {

	public static void main(String[] args)
	{
		GUI g = new GUI();
		g.execute();
		
		DeezerMusicApi d = new DeezerMusicApi();
		d.getArtist();
	}
}
