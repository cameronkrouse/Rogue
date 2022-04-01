public class Map {

	private char[][] map;
	


	public Map( int width, int height ) {
	
		this.map = new char[width][height];
	
		for(int x = 0 ; x < width ; x++) {
	
			for(int y = 0 ; y < height ; y++) {
	
				if(x == 0 || y == 0 || x == width || y == height) {
	
					map[x][y] = '#';
				}
				else {
	
					map[x][y] = '.';
				}
			}
			
		}
		
	}
}

