package model;

import java.util.ArrayList;

public class Player {
	private int id;
	private ArrayList<Cards> cards;
	private Robot robot;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Cards> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Cards> cards) {
		this.cards = cards;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	public Player(int id) {
		this.id = id;
	}
	
	
	public ArrayList<Cards> chooseCards(){
		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).printCard();
		}
		
		return null;
	}

}
