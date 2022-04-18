package Entities;

import java.awt.Color;

public class Entity {

	protected int x;
	protected int y;

	protected String type;
	protected char glyph;
	protected Color color;

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String getType() {
		return type;
	}

	public char getGlyph() {
		return glyph;
		}

	public Color getColor() {
		return color;
	}

	
	public Entity(String name, char glyph, Color color, int xPos, int yPos) {
		
		this.type = name;
		this.glyph = glyph;
		this.color = color;

		this.x = xPos;
		this.y = yPos;
	}



	
}