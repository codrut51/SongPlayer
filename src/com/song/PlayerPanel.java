package com.song;

import javax.swing.*;
import com.song.logic.*;

public abstract class PlayerPanel {

	protected Notification notify;
	protected MusicStreamingServiceApi api;
	public abstract JPanel createPanel(JFrame f);
}
