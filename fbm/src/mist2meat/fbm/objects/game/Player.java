package mist2meat.fbm.objects.game;

import java.io.IOException;

import mist2meat.mkglib.Graphics;
import mist2meat.mkglib.graphics.Image;
import mist2meat.mkglib.io.Input;
import mist2meat.mkglib.io.Keys;

public class Player extends ControlledObject{
	
	public Player(){
		init();
	}
	
//	private enum Condition{
//		NONE, FROZEN
//	}
//	
//	private Condition playerCondition;

	@Override
	public void think() {
		/*
		 * Used eg. for controls and timed actions
		 */
		
		if(isThough()){
			/*
			 * for instance, you may have conditions like freeze
			 */
		}
		handleControls();
		
	}
	public void init(){
		x = 0;
		y = 0;
		try {
			sprite = new Image("res/lol.png",50,50);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		think();
		
	}

	@Override
	public void draw() {
		Graphics.drawImage(sprite, x, y, false);
	}
	
	public void handleControls(){
		int keys[] = Input.getKeysDown();
		
		for(int i : keys){
			switch(i){
			case Keys.KEY_W:
				y--;
				break;
			case Keys.KEY_S:
				y++;
				break;
			case Keys.KEY_A:
				x--;
				break;
			case Keys.KEY_D:
				x++;
				break;
			}
		}
	}

}
