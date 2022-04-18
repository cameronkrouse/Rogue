package Entities;

import java.awt.Color;

public class Creature extends Entity {

	public Creature(String name, char glpyh, Color color, int xPos, int yPos) {
		super(name, glpyh, color, xPos, yPos);
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}


}