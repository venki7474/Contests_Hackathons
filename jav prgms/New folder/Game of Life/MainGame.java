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
	public void startStimulation() {
		int i;
		for(i = 0; i < 4 ; i++) {
			callNextGen();
			System.out.println(this);
		}

	}
	public void callNextGen() {
		int count;
		for ( int i = 0; i < size; i++) {
			for ( int j = 0; j < size; j++) {
				count = countNeighbours(i,j);
				//System.out.println(i + " " + j + " " +count);
				if ( count == 3) {
					nextGen[i][j] = 'X';
				}
				else if  ( count == 2 && currentGen[i][j] == 'X') {
					nextGen[i][j] = 'X';
				}
				else {
					nextGen[i][j] = '.';
				}
			}
		}
		copy();
	}
	private void copy () {
		int i,j;
		for ( i = 0; i < size; i++  ) {
			for ( j = 0; j < size; j++) {
				currentGen[i][j] = nextGen[i][j];
				//System.out.println(currentGen[i][j]);
			}
		}

	}
	private int countNeighbours(int row, int column) {
		int i, j, count = 0;
		if (row == 0 || column == 0 || row == size-1 || column == size-1) {
			return 0;
		}
		for (i = row-1; i <= row + 1; i++) {
			for (j = column - 1; j <= column +1; j++) {
				if (currentGen[i][j] == 'X') {
					count ++;
				}
			}
		}
		if (currentGen[row][column] == 'X') {
			count --;
		}
		return count;

	}

}
public class MainGame {
	public static void main(String[] args) {
		GameOfLife game =new GameOfLife();
		//System.out.println(game);
		game.callNextGen();
		//System.out.println(game);
		game.startStimulation();
	}
}