package mist2meat.fbm.objects.game;

import mist2meat.fbm.objects.MapObject;

public abstract class ControlledObject extends MapObject implements ControlledInterface{
	protected long lastThink;
	protected long lastTimer;
	
	public boolean isThough(){
		return lastThink <= lastTimer;
	}
}
