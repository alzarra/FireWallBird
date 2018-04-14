package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.FireWallBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FireWallBird.WIDTH;
		config.height = FireWallBird.HEIGHT;
		config.title = FireWallBird.TITLE;
		new LwjglApplication(new FireWallBird(), config);
	}
}
