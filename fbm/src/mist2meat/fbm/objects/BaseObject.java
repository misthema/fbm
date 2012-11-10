package mist2meat.fbm.objects;

public abstract class BaseObject implements BaseObjectInterface{
	
	protected double x,y;
	@Override
	public void setX(double x) {
		this.x = x;
		
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public void setY(double y) {
		this.y = y;
		
	}

	@Override
	public double getY() {
		return y;
	}

}
