import java.util.Scanner;

public class TicTacToe
{
	private static char[][] board = new char[3][3];
	static int flag =0;

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int n = 0;
		do{
			initBoard();
			displayBoard();
			System.out.println("for X ,Enter the location");
			int row =keyboard.nextInt();
			int column = keyboard.nextInt();
			do {
				if(row >=3 || column >=3) {
					System.out.println("re-enter the location");
					row = keyboard.nextInt();
					column = keyboard.nextInt();
				}
			}while(row>=3 && column >=3);
			startGame(row,column);
			System.out.println("Do u want to play again ? then enter '1' to play '0' to quit");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}while(n==1);
	}
	public static void initBoard() {
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}
	public static void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	public static void startGame(int theRow,int theColum) {
		int i = 0;
		board[theRow][theColum] = 'X';
		displayBoard();
		while(i<4) {
			flag = 0;
			System.out.println("enter the location for 'O'");
			Scanner sc = new Scanner(System.in);
			int k = 0;
			do {
			  int a = sc.nextInt();
			  int b = sc.nextInt();
			  do {
			    if( a>=3 || b>=3) {  
				  System.out.println("re-enter the location");
				  a = sc.nextInt();
			      b = sc.nextInt();
				}
			  }while(a>=3 && b>=3);
			  if(board[a][b] == ' ') {
			    board[a][b] = 'O'; 
				k++;
		      }
		      else {
		    	System.out.println("re-enter the location");
		      }
		   } while (k != 1);

			gameCheck();
			displayBoard();
			if(flag == 1) {
				System.out.println(" Great...! u won");
				break;
			}

			System.out.println("enter the location for 'X'");
			Scanner sc1 = new Scanner(System.in);
			int l = 0;
			do {
				int x = sc.nextInt();
				int y = sc.nextInt();
				do {
				if( x>=3 || y>=3){  
				System.out.println("re-enter the location");
					x = sc.nextInt();
					y = sc.nextInt();}
				}while(x>=3 && y>=3);
				if(board[x][y] == ' ')
				{
					board[x][y] = 'X'; 
					l++;
		    	}
		    	else
		    	{
		    		System.out.println("re-enter the location");
		    	}
			}while(l!=1);
			gameCheck();
			displayBoard();
			if(flag == 1) {
				System.out.println(" Great...! u won");
				break;
			}
			i++;
		}	

		if(i >= 4)
		{
			System.out.println("game TIE..... ");
		}
	}

	public static void gameCheck()
	{
		int i = 0;
		int j = 0;
		for(i=0 ;i<3;i++) {
			if((board[i][j] == board[i][j+1]) && (board[i][j+1] == board[i][j+2]))
			{
				if((board[i][j]!= ' ') || (board[i][j+1]!= ' ') || (board[i][j+2]!= ' '))
				{
					flag = 1;
					break;

				}
				else { flag =0;}
			}
			else if (board[j][i] == board[j+1][i] && (board[j+1][i])==(board[j+2][i]))
			{
				if((board[j][i]!= ' ') || (board[j+1][i]!= ' ') || (board[j+2][i]!= ' '))
				{	
					flag = 1;
					break;
				}
				else { flag =0;}
			}
		}
		i=0;
		j=0;
			if(board[i][j] == board[i+1][j+1] && board[i+1][j+1] == board[i+2][j+2])
			{
				if((board[i][j] != ' ' )|| (board[i+1][j+1] != ' ' )|| (board[i+2][j+2]!= ' ')) 
				{
					flag = 1;
				}
			}
			else if (board[i][j+2] == board[i+1][j+1] && board[i+1][j+1] == board[i+2][j])
			{
				if((board[i][j+2] != ' ') || (board[i+1][j+1] != ' ') ||  (board[i+2][j]!= ' '))
				{
					flag = 1;
				}
			}

	}
	
}