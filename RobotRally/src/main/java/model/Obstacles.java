package model;

public class Obstacles extends Square {
	private String name;
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Obstacles(Coordinates coordinate, String name, String image) {
		super(coordinate);
		this.name = name;
		this.image = image;
	}

}
