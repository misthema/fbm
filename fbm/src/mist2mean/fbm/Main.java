package mist2mean.fbm;

import java.util.Random;

import org.lwjgl.LWJGLException;

import mist2mean.fbm.objects.BaseObject;
import mist2mean.fbm.objects.MapObject;
import mist2mean.fbm.objects.ObjectContainer;
import mist2meat.mkglib.*;
import mist2meat.mkglib.graphics.Image;
import mist2meat.mkglib.io.Input;
import mist2meat.mkglib.io.Keys;

public class Main {
	public static Screen screen;
	public boolean run;
	public ObjectContainer cont = new ObjectContainer();
	
	public static void main(String[] args) {
		try {
			new Main();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Main() throws LWJGLException {
		init();
		loop();
	}
	
	public void init() throws LWJGLException {
		screen = new Screen(1920,1080);
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
