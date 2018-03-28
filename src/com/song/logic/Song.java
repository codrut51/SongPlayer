package com.song.logic;

public class Song {

	private String title;
	private String author;
	private String urlPrew;
	private String prev;
	private String next;
	
	public Song(String title, String author, String urlPrew, String prev, String next)
	{
		this.title = title;
		this.author = author;
		this.urlPrew = urlPrew;
		this.prev = prev;
		this.next = next;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getPreview()
	{
		return urlPrew;
	}
	
	public String getPrevious()
	{
		return prev;
	}
	
	public String getNext()
	{
		return next;
	}
	
	public String getDetails()
	{
		return "Song: " + title +"  Played by: " + author;
	}
}
