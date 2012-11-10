package mist2meat.fbm.objects;

import mist2meat.mkglib.graphics.Image;

public abstract class MapObject extends BaseObject{

	protected Image sprite;
	
	public MapObject(Image sprite, double x, double y){
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	public MapObject(){
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	public Image getSprite(){
		return sprite;
	}
	
	public void rotateObject(float angle){
		sprite.rotateImage(angle);
	}

}
