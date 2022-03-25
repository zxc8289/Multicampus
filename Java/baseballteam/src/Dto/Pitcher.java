package Dto;

public class Pitcher {
	private int win;
	private int lose;
	private double defense;
	
	
	public Pitcher(int win, int lose, double defense) {
		super();
		this.win = win;
		this.lose = lose;
		this.defense = defense;
	}


	public int getWin() {
		return win;
	}


	public void setWin(int win) {
		this.win = win;
	}


	public int getLose() {
		return lose;
	}


	public void setLose(int lose) {
		this.lose = lose;
	}


	public double getDefense() {
		return defense;
	}


	public void setDefense(double defense) {
		this.defense = defense;
	}


	@Override
	public String toString() {
		return "Pitcher [win=" + win + ", lose=" + lose + ", defense=" + defense + "]";
	}
}
