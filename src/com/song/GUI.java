package com.song;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI {
	
	public GUI() 
	{
		
	}

	@SuppressWarnings("static-access")
	public void execute()
	{
		JFrame frame = new JFrame("Deezer Song Track");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		PlayerPanelFactory pFactory = new PlayerPanelFactory();
		PlayerPanel pPanel = pFactory.getGetPlayerPanel("Welcome");
		PlayerPanel pPanel1 = pFactory.getGetPlayerPanel("Control");
		pPanel1.createPanel(frame);
		pPanel.createPanel(frame);
		frame.setBounds(100, 100, 600, 400);
		frame.setVisible(true);
	}
}
