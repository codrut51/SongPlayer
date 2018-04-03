package com.song.logic;

import java.util.*;

public class NewsNotification extends WatchNotification {
	
	private ArrayList<String> newsHeadlines = new ArrayList<String>();
	
	public NewsNotification(Notifier n)
	{
		addNewsHeadlines();
		this.notify = n;
	}
	
	public void addNewsHeadlines() {
		this.newsHeadlines.add("This is a random news message");
		this.newsHeadlines.add("WOW! 10 reasons the music you listen is the best");
		this.newsHeadlines.add("The one fact Dutch rich people do not want you to know");
		this.newsHeadlines.add("Romanian and Dutch guys creates awesome Deezer music application");
		this.newsHeadlines.add("Hey, you need to know this new music");
		this.newsHeadlines.add("10 people dead in horrible tiger attack");
		this.newsHeadlines.add("Fake news");
		this.newsHeadlines.add("Trump is awesome");
		this.newsHeadlines.add("This is a really important News Notification");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int index = rnd.nextInt(9);
		this.notify.setNotification(this.newsHeadlines.get(index));
	}

}
