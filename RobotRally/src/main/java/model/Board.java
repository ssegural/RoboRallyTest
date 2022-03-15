package model;

import java.util.ArrayList;

public class Board {
	private ArrayList<Coordinates> field;

	public ArrayList<Coordinates> getField() {
		return field;
	}

	public void setField(ArrayList<Coordinates> field) {
		this.field = field;
	}

	public Board() {
		field = new ArrayList<Coordinates>();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 13; j++) {
				Coordinates coordinate = new Coordinates(i, j);
				field.add(coordinate);

			}
		}
		setupBoard();
	}
	

	public void setupBoard() {

	}

	public void printBoard() {

	}
}
