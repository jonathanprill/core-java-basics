package com.perscholas.monsters;

public class FireMonster extends Monster{
	private String s;
	public FireMonster(String s) {
		this.s=s;
	}
	
	public String attack() {
		String name = "Attack with fire!";
		return name;
	}

}
