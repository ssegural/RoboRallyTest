package model;

public class Coordinates {
	private int x; 
	private int y;
	private boolean visited;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
		visited = false;
	}
	
}
