package model;

public class Cards {

	private String name;
	private String image;
	private int value;

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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Cards(String name, int value) {
		this.name = name;
		this.value = value;

	}

	public void printCard() {
		
	}
}
