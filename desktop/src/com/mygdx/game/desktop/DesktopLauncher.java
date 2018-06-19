package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.App;
import com.mygdx.game.Consts;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Consts.getWINDOW_WIDTH();
		config.height = Consts.getWINDOW_HEIGHT();
		new LwjglApplication(new App(), config);
	}
}
