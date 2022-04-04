public class AsciiScreen {
	private int w; //Display Width  (in characters)
	private int h; //Display Height (in characters)
	private char[][] displayBuffer; //Array for holding screen state
	private Map map;

	public AsciiScreen(int x, int y) {
		
		this.w = x;
		this.h = y;
		this.displayBuffer = new char[w][h];

		this.map = new Map(x,y);
		
	}


	private void drawScreen() { //Prints displayBuffer to the screen
		
		for(int x = 0 ; x < w ; x++ ) {

			for(int y = 0 ; y < h ; y++ ) {

				System.out.println( displayBuffer[x][y] );
				
			}
		}
	}

	public void loadNextFrame() {

		displayBuffer = map.getMapGrid; //First, load map into display buffer

		displayBuffer[]
		

		
	}

	

	

	
}