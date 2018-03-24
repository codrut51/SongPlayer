package com.song;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	
	public GUI() 
	{
		
	}

	@SuppressWarnings("static-access")
	public void execute()
	{
		JFrame frame = new JFrame("Deezer Song Track");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//		PlayerPanelFactory pFactory = new PlayerPanelFactory();
//		PlayerPanel pPanel = pFactory.getGetPlayerPanel("Welcome");
//		PlayerPanel pPanel1 = pFactory.getGetPlayerPanel("Control");
//		JPanel p1 = pPanel1.createPanel(frame);
//		JPanel p = pPanel.createPanel(frame);
//		JPanel p2 = pPanel.createPanel(frame);
//		JPanel p3 = pPanel.createPanel(frame);
//		JPanel p4 = pPanel.createPanel(frame);
//		JPanel p5 = pPanel.createPanel(frame);
//		JPanel p6 = pPanel.createPanel(frame);
//		p1.setVisible(false);
//		p.setVisible(true);
//		frame.getContentPane().add(p1);
//		frame.getContentPane().add(p);
//		frame.getContentPane().add(p2);
//		frame.getContentPane().add(p3);
//		frame.getContentPane().add(p4);
//		frame.getContentPane().add(p5);
//		frame.getContentPane().add(p6);
//		frame.setBounds(100, 100, 600, 400);
//		frame.setVisible(true);
//		System.out.println(frame.getComponentCount());
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		frame.add(p);
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.add(p6);
		frame.add(p7);
		
		System.out.println(frame.getComponentCount());
	}
}
