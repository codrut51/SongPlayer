package com.song.cli;

import java.util.Scanner;

import com.song.logic.MusicPlayer;

public class CliDemo {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("Press 1 & enter: for previous");
		System.out.println("Press 2 & enter: for play");
		System.out.println("Press 3 & enter: for pause");
		System.out.println("Press 4 & enter: for next");
		System.out.println("Press 0 & enter: to exit");
		System.out.println("-----------------------");
		System.out.print("Option: ");
		int opt = s.nextInt();
		MusicPlayer p = new MusicPlayer();
		while(opt != 0)
		{
			switch(opt)
			{
				case 1: 
					p.getStreamingServiceApi().previous();
					break;
				case 2:
					p.getStreamingServiceApi().play();
					break;
				case 3:
					p.getStreamingServiceApi().pause();
					break;
				case 4:
					p.getStreamingServiceApi().next();
					break;
			    default:
			    	System.out.println("Invalid Command");
			}
			System.out.println(p.getStreamingServiceApi().getCurrentSong().getDetails());
			System.out.println();
			
			System.out.println("-----------------------");
			System.out.println("Press 1 & enter: for previous");
			System.out.println("Press 2 & enter: for play");
			System.out.println("Press 3 & enter: for pause");
			System.out.println("Press 4 & enter: for next");
			System.out.println("Press 0 & enter: to exit");
			System.out.println("-----------------------");
			System.out.print("Option: ");
			opt = s.nextInt();
		}
	}
}
