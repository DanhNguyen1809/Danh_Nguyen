package Plying_Bird;

import Suon.Objects;

public class bird extends Objects{
	
	private float vt = 0;
	private boolean isFly = false;
	
	public bird(int x, int y, int w, int h) {
		super (x, y, w, h);
	}
	
	public void update (long deltaTime) {
		vt+=PlypyBird.g;
		
		
		this.setPosY(this.getPosY() + vt);
		
		if(vt<0) isFly = true;
		else isFly = false;
	}
	
	public void fly() {
		vt = -3; 
	}
	
	public boolean getIsFly() {
		return isFly;
	}
}
