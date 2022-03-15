package model;

public class Square  {
	
	private Coordinates coordinate;

	public Coordinates getCoordinates() {
		return coordinate;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinate = coordinates;
	}
	
	public Square(Coordinates coordinate) {
		this.coordinate = coordinate;
	}

}
