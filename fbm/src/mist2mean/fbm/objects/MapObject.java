package mist2mean.fbm.objects;

import java.util.Random;

import org.newdawn.slick.Color;

import mist2meat.mkglib.Graphics;
import mist2meat.mkglib.graphics.Image;

public class MapObject extends BaseObject{

	protected Image sprite;
	
	public MapObject(Image sprite, double x, double y){
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	public MapObject(){
		
	}
	
	public void update() {
		//x++;
		rotateObject(sprite.getRotation() + 1);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		Graphics.setColor(Color.yellow);
		Graphics.drawImage(sprite, x, y, true);
		
	}
	public Image getSprite(){
		return sprite;
	}
	
	public void rotateObject(float angle){
		sprite.rotateImage(angle);
	}

}
