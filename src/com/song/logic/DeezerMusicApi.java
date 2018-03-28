package com.song.logic;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DeezerMusicApi implements MusicStreamingServiceApi{
	
	private static String title;
    private static String artist;
    private static String preview;
    private static String previous;
    private static String next;
	
	public DeezerMusicApi()
	{
		try {
            String searchForType = "track"; //track, album, artist and playlist
            String searchFor = "trip%to%mongolia"; //trackname, songname, artistname etc

            URL oracle = new URL("https://api.deezer.com/search/" + searchForType + "/?q=" + searchFor + "&index=0&limit=1&output=json&index=1"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                JSONObject obj = new JSONObject(inputLine);
                JSONArray arr = obj.getJSONArray("data");


                for (Object o : arr) {
                    System.out.println("\n");

                    JSONObject songDetails = (JSONObject) o;

                    String trackTitle = (String) songDetails.get("title");
                    title = trackTitle;
                    System.out.println("Title : " + trackTitle);

                    String trackArtist = (String) songDetails.getJSONObject("artist").get("name");
                    artist = trackArtist;
                    System.out.println("Artist : " + trackArtist);

                    String trackPreview = (String) songDetails.get("preview");
                    preview = trackPreview;
                    System.out.println("Preview : " + trackPreview);
                }
                if(checkTag("next", obj)) {
                    String trackNext = (String) obj.get("next");
                    next = trackNext;
                    System.out.println("Next track : " + trackNext);
                }

                if(checkTag("prev", obj)){
                    String trackPrevious = (String) obj.get("prev");
                    previous = trackPrevious;
                    System.out.println("Previous track : " + trackPrevious);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    private static boolean checkTag(String tagName, JSONObject songDetail)
    {
        try{
            String check = (String) songDetail.get(tagName);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getPreview() {
        return preview;
    }

    public String getPrevious() {
        return previous;
    }

    public String getNext() {
        return next;
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
