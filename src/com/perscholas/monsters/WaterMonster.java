package com.perscholas.monsters;

public class WaterMonster extends Monster {
	private String s;

	public WaterMonster(String s) {
		this.s = s;
	}

	public String attack() {
		String name = "Attack with water!";
		return name;
	}
}
