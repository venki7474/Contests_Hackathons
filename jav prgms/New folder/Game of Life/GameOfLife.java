/**
*Game of Life.
*
*/
class GameOfLife {
	final int size = 5;
	private char[][] currentGen;
	private char[][] nextGen;

	GameOfLife() {
		 currentGen = new char[size][size];
		 nextGen = new char[size][size];
		 initGen();
	}
	private void initGen() {
		int i, j;
		for( i = 0; i < size; i++ ) {
			for ( j = 0; j < size; j++ ) {
				currentGen[i][j] = '.';
			}
		}
		currentGen[1][2] = 'X';
		currentGen[2][2] = 'X';
		currentGen[3][2] = 'X';
	}
	public String toString() {
		String str = "";
		for(int i = 0 ; i < size; i++ ) {
			for ( int j = 0; j < size; j++) {
				str = str + currentGen[i][j];
			}
			str = str + "\n";
		}
		return str;
	}

}
public class MainGame {
	public static void main(String[] args) {
		GameOfLife game =new GameOfLife();
		System.out.println(game.str);
	}
}