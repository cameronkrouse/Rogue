//JellePelgrims
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;
import Entities.*;




public class Roguelike {

	private static int windowWidth = 20;
	private static int windowHeight = 10;

	public static void main(String[] args) {
		
		Roguelike game = new Roguelike(windowWidth, windowHeight);
		game.run();
		
	}
	

	private Creature player;



	private AsciiScreen display;

	public Roguelike(int windowWidth, int windowHeight) {
		
		
		this.player = new Creature("player", '@', Color.white, 5, 5);
		display = new AsciiScreen( windowWidth, windowHeight);
	}

	private void run(){
		
	}



	



}

	




