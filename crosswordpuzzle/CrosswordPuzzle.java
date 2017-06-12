import java.util.*;
import java.io.*;

public class CrosswordPuzzle {

private Scanner filePuzzle;
private Scanner scanLine;
private String[] animal = new String[18];
private String[] descrip = new String[18];
private char[][] gameBoard = new char[12][12];

Map<String, String> crosswordMap = new HashMap<String,String>();
Object[] names;

static final int GAME_BOARD_SIZE=12;

Boolean wordDirection;


public CrosswordPuzzle ()
{
openFile();
readFile();
printGrid();
}

private void openFile()
{
try 
{
filePuzzle = new Scanner(new File ("puzzle.txt"));

}
catch (Exception e)
{
System.out.println("File does not exist");
}

}

private void readFile()
{
try
{

int count = 0;

while (filePuzzle.hasNext() )
{
String strLine = filePuzzle.nextLine();
scanLine = new Scanner(strLine);

animal[count] = scanLine.next();
descrip[count] = scanLine.nextLine();
//System.out.print(animal[count]);
System.out.println(descrip[count]);
System.out.println();
count++;

}
}
catch (Exception e)
{
System.err.print("Error: " + e.getMessage());
}


}

private void printGrid()
{
int row;
int col;

try
{
Scanner scan = new Scanner(new File("puzzle2.txt"));
wordDirection = true;
gameBoard = new char[12][12];
for(int i=0; i<GAME_BOARD_SIZE; i++)
{
for(int j=0; j<GAME_BOARD_SIZE; j++)
{
gameBoard[i][j] = '-';
}
}
while(scan.hasNext())
{
String key = scan.next();
String map = scan.nextLine();
crosswordMap.put(key, map);
}
names = crosswordMap.keySet().toArray();
Set<String> noGoes = new HashSet<String>();
for(int i=0; i<names.length; i++)
{
if (wordDirection)
{
System.out.println("Across");
}
else
{
System.out.println("Down");
}


String theKey = this.getRandom();
System.out.println(theKey);
Random rand = new Random();


if (wordDirection)
{
row = rand.nextInt(GAME_BOARD_SIZE);
col = rand.nextInt(GAME_BOARD_SIZE-theKey.length()-1);
}

else
{
col = rand.nextInt(GAME_BOARD_SIZE);
row = rand.nextInt(GAME_BOARD_SIZE-theKey.length()-1);
System.out.println();
}
this.add(row, col, theKey, wordDirection, noGoes);

wordDirection = !wordDirection;
}

System.out.println(this.gameBoardToString());

}
catch(IOException e) {}
}

private void add(int row, int col, String theKey, Boolean direction, Set<String> noGoes)
{
int count = 0;
if( canFit(theKey, row, col) )
{
while( count<theKey.length() )
{
gameBoard[row][col] = theKey.charAt(count);
if(direction)
{
col++;
}else{
row++;
}
count++;
}
}else{
noGoes.add(theKey);
}
}

private Boolean canFit( String theKey, int row, int col)
{
Boolean canFit = true;
int count = 0;
for(int i=0; i<theKey.length(); i++)
{
if( gameBoard[row][col] == '-' || gameBoard[row][col] == theKey.charAt(count) )
{
if(wordDirection)
{
col++;
}else{
row++;
}
}else{
canFit = false;
break;
}
}
return canFit;
}

private String getRandom()
{
Random rand = new Random();
String randKey = null;
int count = 0;
while(randKey == null && count<names.length)
{
int randInt = rand.nextInt(names.length);
if(names[randInt] != null)
{
randKey = names[randInt]+"";
count++;
//Remove word we got from keys and set that spot to null.
names[randInt] = null;
}
}
return randKey;
}

public String toString()
{
String ts = "";
for(int i=0; i<names.length; i++)
{
ts += names[i] + "\n";
}
return ts;
}

public String gameBoardToString()
{
String ts = "";
for(int i=0; i<GAME_BOARD_SIZE; i++)
{
for(int j=0; j<GAME_BOARD_SIZE; j++)
{
ts += gameBoard[i][j];
}
ts += "\n";
}
return ts;
}

private void fillArray(char[][] array)
{
for(int i =0; i< GAME_BOARD_SIZE; i++)
{
for(int k=0; k<GAME_BOARD_SIZE; k++)
{
array[i][k] = '-';
}
}
}
}