package com.perscholas.monsters;

public class StoneMonster extends Monster {

	private String s;

	public StoneMonster(String s) {
		this.s = s;
	}

	public String attack() {
		String name = "Attack with stone!";
		return name;
	}

}
