package model;

public class Robot extends Square {

	private char orientation;

	public char getOrientation() {
		return orientation;
	}

	public void setOrientation(char orientation) {
		this.orientation = orientation;
	}

	public Robot(Coordinates coordinate, char orientation) {
		super(coordinate);
		this.orientation = orientation;
	}
	
	

}
