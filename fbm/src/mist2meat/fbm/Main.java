package mist2meat.fbm;

import java.lang.reflect.Field;
import java.util.Random;

import mist2meat.fbm.objects.BaseObject;
import mist2meat.fbm.objects.MapObject;
import mist2meat.fbm.objects.ObjectContainer;
import mist2meat.mkglib.Screen;
import mist2meat.mkglib.graphics.Image;
import mist2meat.mkglib.io.Input;
import mist2meat.mkglib.io.Keys;

import org.lwjgl.LWJGLException;

public class Main {
	public static Screen screen;
	public boolean run;
	public ObjectContainer cont = new ObjectContainer();
	
	public static void main(String[] args) {
		setPaths();
		
		try {
			new Main();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void setPaths() {
		System.setProperty("java.library.path", "lib/natives");
		
		try {
			final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
			sysPathsField.setAccessible(true);
		    sysPathsField.set(null, null);
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	public Main() throws LWJGLException {
		init();
		loop();
	}
	
	public void init() throws LWJGLException {
		screen = new Screen(800,600,"Homoruutudin");
		run = true;
		
		Random rand = new Random();
		cont.addObject(new MapObject(new Image("res/lol.png",6, 1000),50, 50));

		for(BaseObject obj : cont.getObjectsByClass(new MapObject())){

		}
	}
	
	public void loop(){
		while(run){
			wannaQuit();
			cont.update();
			cont.draw();
			screen.update();
		}
	}
	
	public void wannaQuit(){
		if(screen.wannaQuit() || Input.isKeyDown(Keys.KEY_ESCAPE)){
			run = false;
		}
	}
}