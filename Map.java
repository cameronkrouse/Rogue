public class Map {

	private char[][] mapGrid;
	


	public Map( int width, int height ) {
	
		this.mapGrid = new char[width][height];
		for(int x = 0 ; x < width ; x++) {
	
			for(int y = 0 ; y < height ; y++) {
	
				if(x == 0 || y == 0 || x == width || y == height) {
	
					mapGrid[x][y] = '#';
				}
				else {
	
					mapGrid[x][y] = '.';
				}
			}
		}
	}

	public char[][] getMapGrid() {

		return mapGrid;
	}
}

