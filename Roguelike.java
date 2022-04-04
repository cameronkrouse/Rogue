//JellePelgrims
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;




public class Roguelike {

	public static void main(String[] args) {
		
	Roguelike game = new Roguelike("OwO");
	game.run();
		
	}
	
	private String name;
	private Creature player;



	private UserInterface ui;

	public Roguelike(String name, int windowHeight, int windowWidth) {
		
		this.name = name;
		this.player = new Creature("player", '@', Color.white, 10, 10);
		ui = new UserInterface(this.name, 80, 24);
		
	}
	



}

	




}