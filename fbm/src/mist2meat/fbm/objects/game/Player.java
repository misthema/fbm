package mist2meat.fbm.objects.game;

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
		
	}

	@Override
	public void update() {
		think();
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	public void handleControls(){
		
	}

}
