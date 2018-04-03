package com.song.logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class DeezerMusicApi extends MusicStreamingServiceApi{
	
	private AdvancedPlayer player = null;
	private Thread t;
	private ApiAdapter adapter = null;
	private int stopAt;
	public DeezerMusicApi(String method)
	{
		if(method.equalsIgnoreCase("xml") || method.equalsIgnoreCase("yaml"))
		{
			adapter = new ApiAdapter(method);
		} else if(method.equalsIgnoreCase("json")){
			setCurrentSong(null);
		}else {
			System.out.println("Method not available");
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

		if(adapter == null)
		{
	        if (player != null) 
	        {
	        	try {
		         if(t == null || !t.isAlive())
		         {
			 		InputStream buff = (InputStream)new BufferedInputStream(new URL(this.current.getPreview()).openStream()); //new BufferedInputStream(new FileInputStream(new File(path)));
			        this.player = new AdvancedPlayer(buff);
			        player.setPlayBackListener(new PlaybackListener() {
			            @Override
			            public void playbackStarted(PlaybackEvent playbackEvent) {
			            }

			            @Override
			            public void playbackFinished(PlaybackEvent playbackEvent) {
			            	stopAt = playbackEvent.getFrame();
			            }
			        });
		         }
				}catch(Exception e) {
					e.printStackTrace();
				}
	        	if(t == null && stopAt == 0)
	        	{
	        		t = null;
		        	t = new Thread(new Runnable() {
		
						@Override
						public void run() {
				            try {
								player.play();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				        }        		
		        	});
		        	t.start();
	        	} else {
	        		if(stopAt != 0)
	        		{
	        			
		        		t = null;
			        	t = new Thread(new Runnable() {
			
							@Override
							public void run() {
					            try {
									player.play(stopAt);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					        }        		
			        	});
			        	t.start();
	        		}
	        	}
	        	
	        }
		}else {
			adapter.play();
		}
	}
    private boolean checkTag(String tagName, JSONObject songDetail)
    {
        try{
            songDetail.get(tagName);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }

	@Override
	public void pause() {
		if(adapter == null)
		{
			player.stop();
		}else {
			adapter.pause();
		}
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub

		if(adapter == null)
		{
			setCurrentSong(current.getPrevious());
		}else {
			adapter.play();
		}
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		if(adapter == null)
		{
			setCurrentSong(current.getNext());
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
	protected void setCurrentSong(String url) {
		if(adapter == null)
		{
			String title = null;
			String artist = null;
			String preview = null;
			String previous = null;
			String next = null;
			try {
				// TODO Auto-generated method stub
				 String searchForType = "track"; //track, album, artist and playlist
		         String searchFor = "lente%in%de%herfst"; //trackname, songname, artistname etc
		         URL oracle;
		         if(url == null)
		         {
		        	  oracle = new URL("https://api.deezer.com/search/" + searchForType + "/?q=" + searchFor + "&index=0&limit=1&output=json&index=1"); // URL to Parse
		         }else {
		        	  oracle = new URL(url);
		         }
		         URLConnection yc = oracle.openConnection();
		         BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		
		         String inputLine;
		         while ((inputLine = in.readLine()) != null) {
		             JSONObject obj = new JSONObject(inputLine);
		             JSONArray arr = obj.getJSONArray("data");
		
		
		             for (Object o : arr) {
		                 JSONObject songDetails = (JSONObject) o;
		
		                 String trackTitle = (String) songDetails.get("title");
		                 title = trackTitle;
		
		                 String trackArtist = (String) songDetails.getJSONObject("artist").get("name");
		                 artist = trackArtist;
		
		                 String trackPreview = (String) songDetails.get("preview");
		                 preview = trackPreview;
		             }
		             if(checkTag("next", obj)) {
		                 String trackNext = (String) obj.get("next");
		                 next = trackNext;
		             }
		
		             if(checkTag("prev", obj)){
		                 String trackPrevious = (String) obj.get("prev");
		                 previous = trackPrevious;
		             }
		         }
		         in.close();
		     } catch (FileNotFoundException e1) {
		         e1.printStackTrace();
		     } catch (IOException e2) {
		         e2.printStackTrace();
		     } catch (JSONException e3) {
		         e3.printStackTrace();
		     } catch (Exception e) {
				// TODO Auto-generated catch block
			}
			try {
				this.current = new Song(title, artist, preview, previous, next);
		         if(t == null || !t.isAlive())
		         {
			 		InputStream buff = (InputStream)new BufferedInputStream(new URL(this.current.getPreview()).openStream()); //new BufferedInputStream(new FileInputStream(new File(path)));
			        player = new AdvancedPlayer(buff);
			        player.setPlayBackListener(new PlaybackListener() {
			            @Override
			            public void playbackStarted(PlaybackEvent playbackEvent) {
			            }

			            @Override
			            public void playbackFinished(PlaybackEvent playbackEvent) {
			            	stopAt = playbackEvent.getFrame();
			            }
			        });
		         }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			adapter.setCurrentSong(url);
		}
		
		
	}
}
