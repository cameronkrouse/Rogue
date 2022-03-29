//JellePelgrims
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;




public class Roguelike {

	public static void main(String[] args){
	Roguelike game = new Roguelike("OwO");
	game.run();
}
	private String name;
	private Creature player;

	private boolean isRunning;
	private int framesPerSecond = 60;
	private int timePerLoop = 1000000000 / framesPerSecond;

	private UserInterface ui;

	public Roguelike(String name) {
		this.name = name;
		this.player = new Creature("player", '@', Color.white, 10, 10);
		ui = new UserInterface(this.name, 80, 24);
	}
	



public void processInput() {
	InputEvent event = ui.getnextInput();
	if(event instanceof KeyEvent) {
		KeyEvent keypress = (KeyEvent)event;
		switch (keypress.getKeyCode()){
			case KeyEvent.VK_LEFT:
				player.move(-1,0);
				break;
			case KeyEvent.VK_RIGHT:
				player.move(1,0);
				break;
			case KeyEvent.VK_UP:
				player.move(0,1);
				break;
			case KeyEvent.VK_DOWN:
				player.move(0,-1);
				break;
		}
	}
}

public void render() {
	ui.clear();
	ui.drawChar(player.getGlyph(), player.getX(), player.getY(), player.getColor());
	ui.refresh();
}


public void run() {
    isRunning = true;

    while(isRunning) {
        long startTime = System.nanoTime();

        processInput();
        render();

        long endTime = System.nanoTime();

        long sleepTime = timePerLoop - (endTime-startTime);

        if (sleepTime > 0) {
            try {
                Thread.sleep(sleepTime/1000000);
            } catch (InterruptedException e) {
                isRunning = false;
            }
        }
    }
} 
}