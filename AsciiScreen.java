public class AsciiScreen {
	private int w; //Display Width  (in characters)
	private int h; //Display Height (in characters)
	private char[][] frameBuffer; //Array for holding screen state
	private Map map;

	public AsciiScreen(int x, int y) {
		
		this.w = x;
		this.h = y;
		this.frameBuffer = new char[w][h];

		this.map = new Map(x,y);
		
	}


	private void drawScreen() { //Prints displayBuffer to the screen
		
		for(int x = 0 ; x < w ; x++ ) {

			for(int y = 0 ; y < h ; y++ ) {

				System.out.println( frameBuffer[x][y] );
				
			}
		}
	}

	public void loadNextFrame(int playerX, int playerY) {

		frameBuffer = map.getMapGrid();      //First, load map into frame buffer

		frameBuffer[playerX][playerY] = '@'; //Lastly, player is loaded into frame buffer
		

		
	}

	

	

	
}