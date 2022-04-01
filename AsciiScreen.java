public class AsciiScreen {
	private int w; //Display Width  (in characters)
	private int h; //Display Height (in characters)
	private char[][] displayBuffer; //Array for holding screen state

	public AsciiScreen(int x, int y) {
		
		this.width = w;
		this.height = h;
		this.displayBuffer = new char[w][h];
		
	}

	private void drawScreen() { //Prints displayBuffer to the screen
		
		for(int x = 0 ; x < w ; x++ ) {

			for(int y = 0 ; y < h ; y++ ) {

				System.out.println( displayBuffer[x][y] );
				
			}
		}
	}

	public void loadNextFrame() {

		for(int x = 0 ; x < w ; x++) {

			for(int y = 0 ; y < h ; y++) {

				displayBuffer[x][y] = currentMap[x][y];
			}
		}
		

		
	}

	

	

	
}