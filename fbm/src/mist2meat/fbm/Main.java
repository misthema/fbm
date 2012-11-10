package mist2meat.fbm;

import java.lang.reflect.Field;
import java.util.Random;

import mist2meat.fbm.objects.ObjectContainer;
import mist2meat.mkglib.Screen;
import mist2meat.mkglib.io.Input;
import mist2meat.mkglib.io.Keys;

import org.lwjgl.Sys;

public class Main {

	public static Screen	screen;
	public boolean			run;
	public ObjectContainer	cont	= new ObjectContainer();

	public static void main( String[] args ) {
		setPaths();

		try {
			new Main();
		} catch ( Exception e ) {
			Sys.alert( "Error Initializing!", e.getMessage() );
			e.printStackTrace();
		}
	}

	private static void setPaths() {
		System.setProperty( "java.library.path", "lib/natives" );

		try {
			final Field sysPathsField = ClassLoader.class.getDeclaredField( "sys_paths" );
			sysPathsField.setAccessible( true );
			sysPathsField.set( null, null );
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	public Main() throws Exception {
		init();
		loop();
	}

	public void init() throws Exception {
		screen = new Screen( 800, 600, "Homoruudutin", false );
		run = true;

		Random rand = new Random();
		//cont.addObject(new MapObject(new Image("res/lol.png",6, 1000),50, 50));
	}

	public void loop() {
		while ( run ) {
			wannaQuit();
			cont.update();
			cont.draw();
			screen.update();
		}
	}

	public void wannaQuit() {
		if ( screen.wannaQuit() || Input.isKeyDown( Keys.KEY_ESCAPE ) ) {
			run = false;
		}
	}
}
