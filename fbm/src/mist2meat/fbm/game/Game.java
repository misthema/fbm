package mist2meat.fbm.game;

import org.newdawn.slick.Color;

import mist2meat.fbm.objects.game.Player;
import mist2meat.mkglib.io.Font;

public class Game {
	//TODO: MapHandler and Player class
	Font lol;
	public Player player;
	
	public Game(){
		init();
	}
	
	public void init(){
		player = new Player();
	}
	
	public void process(){
		update();
		draw();
	}
	
	public void update() {
		//MapUpdate
		//HUD-Update
		player.update();
		
	}
	
	public void draw() {
		lol.drawString(50, 50, "lolol");
		//MapDraw
		//HUD-Draw
		player.draw();
	}
}
